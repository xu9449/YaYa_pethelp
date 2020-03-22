CREATE TABLE adopter (
    /*id                INTEGER NOT NULL default nextval('department_id_seq'), */
    id                SERIAL NOT NULL,
    name              VARCHAR(30) not null unique,
    tel               VARCHAR(40),
    email             VARCHAR(50),
    location          VARCHAR(100),
    description       VARCHAR(150),
    adopt_date        TIMESTAMP,
    pet_id            INTEGER

);