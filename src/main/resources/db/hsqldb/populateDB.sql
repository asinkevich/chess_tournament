INSERT INTO vets VALUES (1, 'James', 'Carter');
INSERT INTO vets VALUES (2, 'Helen', 'Leary');
INSERT INTO vets VALUES (3, 'Linda', 'Douglas');
INSERT INTO vets VALUES (4, 'Rafael', 'Ortega');
INSERT INTO vets VALUES (5, 'Henry', 'Stevens');
INSERT INTO vets VALUES (6, 'Sharon', 'Jenkins');

INSERT INTO specialties VALUES (1, 'radiology');
INSERT INTO specialties VALUES (2, 'surgery');
INSERT INTO specialties VALUES (3, 'dentistry');

INSERT INTO vet_specialties VALUES (2, 1);
INSERT INTO vet_specialties VALUES (3, 2);
INSERT INTO vet_specialties VALUES (3, 3);
INSERT INTO vet_specialties VALUES (4, 2);
INSERT INTO vet_specialties VALUES (5, 1);

INSERT INTO types VALUES (1, 'cat');
INSERT INTO types VALUES (2, 'dog');
INSERT INTO types VALUES (3, 'lizard');
INSERT INTO types VALUES (4, 'snake');
INSERT INTO types VALUES (5, 'bird');
INSERT INTO types VALUES (6, 'hamster');

INSERT INTO owners VALUES (1, 'George', 'Franklin', '110 W. Liberty St.', 'Madison', '6085551023');
INSERT INTO owners VALUES (2, 'Betty', 'Davis', '638 Cardinal Ave.', 'Sun Prairie', '6085551749');
INSERT INTO owners VALUES (3, 'Eduardo', 'Rodriquez', '2693 Commerce St.', 'McFarland', '6085558763');
INSERT INTO owners VALUES (4, 'Harold', 'Davis', '563 Friendly St.', 'Windsor', '6085553198');
INSERT INTO owners VALUES (5, 'Peter', 'McTavish', '2387 S. Fair Way', 'Madison', '6085552765');
INSERT INTO owners VALUES (6, 'Jean', 'Coleman', '105 N. Lake St.', 'Monona', '6085552654');
INSERT INTO owners VALUES (7, 'Jeff', 'Black', '1450 Oak Blvd.', 'Monona', '6085555387');
INSERT INTO owners VALUES (8, 'Maria', 'Escobito', '345 Maple St.', 'Madison', '6085557683');
INSERT INTO owners VALUES (9, 'David', 'Schroeder', '2749 Blackhawk Trail', 'Madison', '6085559435');
INSERT INTO owners VALUES (10, 'Carlos', 'Estaban', '2335 Independence La.', 'Waunakee', '6085555487');

INSERT INTO pets VALUES (1, 'Leo', '2000-09-07', 1, 1);
INSERT INTO pets VALUES (2, 'Basil', '2002-08-06', 6, 2);
INSERT INTO pets VALUES (3, 'Rosy', '2001-04-17', 2, 3);
INSERT INTO pets VALUES (4, 'Jewel', '2000-03-07', 2, 3);
INSERT INTO pets VALUES (5, 'Iggy', '2000-11-30', 3, 4);
INSERT INTO pets VALUES (6, 'George', '2000-01-20', 4, 5);
INSERT INTO pets VALUES (7, 'Samantha', '1995-09-04', 1, 6);
INSERT INTO pets VALUES (8, 'Max', '1995-09-04', 1, 6);
INSERT INTO pets VALUES (9, 'Lucky', '1999-08-06', 5, 7);
INSERT INTO pets VALUES (10, 'Mulligan', '1997-02-24', 2, 8);
INSERT INTO pets VALUES (11, 'Freddy', '2000-03-09', 5, 9);
INSERT INTO pets VALUES (12, 'Lucky', '2000-06-24', 2, 10);
INSERT INTO pets VALUES (13, 'Sly', '2002-06-08', 1, 10);

INSERT INTO visits VALUES (1, 7, '1996-03-04', 'rabies shot');
INSERT INTO visits VALUES (2, 8, '1996-03-04', 'rabies shot');
INSERT INTO visits VALUES (3, 8, '1996-06-04', 'neutered');
INSERT INTO visits VALUES (4, 7, '1996-09-04', 'spayed');

INSERT INTO news VALUES (1, 'Costa Concordia: Five more bodies found', 'More than two months after the cruise ship Costa Concordia capsized off the Italian coast, a team searching the wreck has found five more bodies.
                                                                        Italian authorities say they were found outside the ship, in a small space between the wreck and the sea bed.
                                                                        Altogether 30 bodies have now been found since the vessel ran aground off the island of Giglio on 13 January.', '1996-09-04');
INSERT INTO news VALUES (2, 'Article 2', 'text 2', '1996-09-04');

INSERT INTO participants VALUES (1, 'Mariya', 'Rudzko', '1990', 'BY', 'grand-master', '300', 'FEMALE');
INSERT INTO participants VALUES (2, 'Katsyarina', 'Rudzko', '1986', 'BY', 'master', '270', 'FEMALE');
INSERT INTO participants VALUES (3, 'Pavel', 'Kurmaz', '1983', 'BY', 'master', '270', 'MALE');
INSERT INTO participants VALUES (4, 'Pavel2', 'Kurmaz2', '1983', 'BY', 'master', '270', 'MALE');
INSERT INTO participants VALUES (5, 'Pavel3', 'Kurmaz3', '1983', 'BY', 'master', '270', 'MALE');
INSERT INTO participants VALUES (6, 'Pavel4', 'Kurmaz4', '1983', 'BY', 'master', '270', 'MALE');
INSERT INTO participants VALUES (7, 'Pavel5', 'Kurmaz5', '1983', 'BY', 'master', '270', 'MALE');
INSERT INTO participants VALUES (8, 'Pavel6', 'Kurmaz6', '1983', 'BY', 'master', '270', 'MALE');

INSERT INTO tournament_participants VALUES (1, 1, 0);
INSERT INTO tournament_participants VALUES (2, 2, 0);
INSERT INTO tournament_participants VALUES (3, 3, 0);
INSERT INTO tournament_participants VALUES (4, 4, 0);
INSERT INTO tournament_participants VALUES (5, 5, 0);
INSERT INTO tournament_participants VALUES (6, 6, 0);
INSERT INTO tournament_participants VALUES (7, 7, 0);
INSERT INTO tournament_participants VALUES (8, 8, 0);

INSERT INTO parties VALUES (1, 1, 2, 0, 0);
INSERT INTO parties VALUES (2, 3, 4, 0, 0);
INSERT INTO parties VALUES (3, 5, 6, 0, 0);
INSERT INTO parties VALUES (4, 7, 8, 0, 0);

INSERT INTO tours VALUES (1, 1);
INSERT INTO tours VALUES (2, 2);

INSERT INTO tour_parties VALUES (1, 1);
INSERT INTO tour_parties VALUES (1, 2);
INSERT INTO tour_parties VALUES (1, 3);
INSERT INTO tour_parties VALUES (2, 4);

INSERT INTO tournaments VALUES (1, 'World Championship', 'Minsk, Belarus');

INSERT INTO tournaments_participants VALUES (1, 1);
INSERT INTO tournaments_participants VALUES (1, 2);
INSERT INTO tournaments_participants VALUES (1, 3);
INSERT INTO tournaments_participants VALUES (1, 4);
INSERT INTO tournaments_participants VALUES (1, 5);
INSERT INTO tournaments_participants VALUES (1, 6);
INSERT INTO tournaments_participants VALUES (1, 7);
INSERT INTO tournaments_participants VALUES (1, 8);

INSERT INTO tournament_tours VALUES (1, 1);
INSERT INTO tournament_tours VALUES (1, 2);