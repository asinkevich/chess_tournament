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

CREATE TABLE parties (
	id INTEGER NOT NULL IDENTITY PRIMARY KEY,
	first_player_id INTEGER NOT NULL,
	second_player_id INTEGER NOT NULL,
	first_player_score INTEGER DEFAULT 0,
    second_player_score INTEGER DEFAULT 0
);
alter table parties add constraint fk_parties_first_player foreign key (first_player_id) references participants(id);
alter table parties add constraint fk_parties_second_player foreign key (second_player_id) references participants(id);
CREATE INDEX parties_participants_id ON parties(first_player_id, second_player_id);