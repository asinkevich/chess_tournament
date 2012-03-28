CREATE TABLE vets (
	id INTEGER NOT NULL IDENTITY PRIMARY KEY,
	first_name VARCHAR(30),
	last_name VARCHAR(30)
);
CREATE INDEX vets_last_name ON vets(last_name);

CREATE TABLE specialties (
	id INTEGER NOT NULL IDENTITY PRIMARY KEY,
	name VARCHAR(80)
);
CREATE INDEX specialties_name ON specialties(name);

CREATE TABLE vet_specialties (
	vet_id INTEGER NOT NULL,
	specialty_id INTEGER NOT NULL
);
alter table vet_specialties add constraint fk_vet_specialties_vets foreign key (vet_id) references vets(id);
alter table vet_specialties add constraint fk_vet_specialties_specialties foreign key (specialty_id) references specialties(id);

CREATE TABLE types (
	id INTEGER NOT NULL IDENTITY PRIMARY KEY,
	name VARCHAR(80)
);
CREATE INDEX types_name ON types(name);

CREATE TABLE owners (
	id INTEGER NOT NULL IDENTITY PRIMARY KEY,
	first_name VARCHAR(30),
	last_name VARCHAR(30),
	address VARCHAR(255),
	city VARCHAR(80),
	telephone VARCHAR(20)
);
CREATE INDEX owners_last_name ON owners(last_name);

CREATE TABLE pets (
	id INTEGER NOT NULL IDENTITY PRIMARY KEY,
	name VARCHAR(30),
	birth_date DATE,
	type_id INTEGER NOT NULL,
	owner_id INTEGER NOT NULL
);
alter table pets add constraint fk_pets_owners foreign key (owner_id) references owners(id);
alter table pets add constraint fk_pets_types foreign key (type_id) references types(id);
CREATE INDEX pets_name ON pets(name);

CREATE TABLE visits (
	id INTEGER NOT NULL IDENTITY PRIMARY KEY,
	pet_id INTEGER NOT NULL,
	visit_date DATE,
	description VARCHAR(255)
);
alter table visits add constraint fk_visits_pets foreign key (pet_id) references pets(id);
CREATE INDEX visits_pet_id ON visits(pet_id);

CREATE TABLE news (
	id INTEGER NOT NULL IDENTITY PRIMARY KEY,
	name VARCHAR(500),
	text VARCHAR(9999),
	date DATE
);
CREATE INDEX news_name ON news(name);

CREATE TABLE participants (
	id INTEGER NOT NULL IDENTITY PRIMARY KEY,
	first_name VARCHAR(30),
	last_name VARCHAR(30),
	birth_year INTEGER,
	country VARCHAR(5),
	title VARCHAR(30),
	points INTEGER,
	gender VARCHAR(6)
);
CREATE INDEX participants_last_name ON participants(last_name);


CREATE TABLE tournament_participants (
  id INTEGER NOT NULL IDENTITY PRIMARY KEY,
  participant_id INTEGER,
  score INTEGER
);
alter table tournament_participants add constraint fk_tournament_participant foreign key (participant_id) references participants(id);


CREATE TABLE parties (
	id INTEGER NOT NULL IDENTITY PRIMARY KEY,
	first_player_id INTEGER NOT NULL,
	second_player_id INTEGER NOT NULL,
	first_player_score INTEGER DEFAULT 0,
  second_player_score INTEGER DEFAULT 0
);
alter table parties add constraint fk_parties_first_player foreign key (first_player_id) references tournament_participants(id);
alter table parties add constraint fk_parties_second_player foreign key (second_player_id) references tournament_participants(id);
CREATE INDEX parties_participants_id ON parties(first_player_id, second_player_id);


CREATE TABLE tours (
	id INTEGER NOT NULL IDENTITY PRIMARY KEY,
  tour_index INTEGER NOT NULL
);

CREATE TABLE tour_parties (
	tour_id INTEGER NOT NULL,
	party_id INTEGER NOT NULL
);
alter table tour_parties add constraint fk_tour_parties_tours foreign key (tour_id) references tours(id);
alter table tour_parties add constraint fk_tour_parties_parties foreign key (party_id) references parties(id);

CREATE TABLE tournaments (
  id INTEGER NOT NULL IDENTITY PRIMARY KEY,
  tournament_name VARCHAR(256),
  place VARCHAR(256)
);
CREATE INDEX tournaments_tournament_name ON tournaments(tournament_name);

CREATE TABLE tournaments_participants (
	tournament_id INTEGER NOT NULL,
	tournament_participant_id INTEGER NOT NULL
);
alter table tournaments_participants add constraint fk_tournaments_participants_tournaments foreign key (tournament_id) references tournaments(id);
alter table tournaments_participants add constraint fk_tournaments_participants_participants foreign key (tournament_participant_id) references tournament_participants(id);

CREATE TABLE tournament_tours (
	tournament_id INTEGER NOT NULL,
	tour_id INTEGER NOT NULL
);
alter table tournament_tours add constraint fk_tournament_tours_tournaments foreign key (tournament_id) references tournaments(id);
alter table tournament_tours add constraint fk_tournament_tours_tours foreign key (tour_id) references tours(id);