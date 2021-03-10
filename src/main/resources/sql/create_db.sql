DROP TABLE IF EXISTS products;
DROP TABLE IF EXISTS contracts;
DROP TABLE IF EXISTS instructions;
DROP TABLE IF EXISTS persons;
DROP TABLE IF EXISTS accounts;
DROP TABLE IF EXISTS presentations;
DROP TABLE IF EXISTS descriptions;
DROP TABLE IF EXISTS categories;
DROP TABLE IF EXISTS credentials;
DROP TABLE IF EXISTS conflicts;
DROP TABLE IF EXISTS images;

CREATE TABLE images
(
  id BIGINT NOT NULL AUTO_INCREMENT,

  small VARCHAR(20) NOT NULL,
  large VARCHAR(20) NOT NULL,

  CONSTRAINT pk_images PRIMARY KEY (id)
);

CREATE TABLE conflicts
(
  id BIGINT NOT NULL AUTO_INCREMENT,

  reason VARCHAR(20) NOT NULL,
  intruder VARCHAR(20) NOT NULL,

  CONSTRAINT pk_conflicts PRIMARY KEY (id)
);

CREATE TABLE credentials
(
  id BIGINT NOT NULL AUTO_INCREMENT,

  login VARCHAR(20) NOT NULL,
  password VARCHAR(20) NOT NULL,

  CONSTRAINT credentials_login_unique UNIQUE (login),
  CONSTRAINT pk_credentials PRIMARY KEY (id)
);

CREATE TABLE categories
(
  id BIGINT NOT NULL AUTO_INCREMENT,
  categories_id BIGINT NOT NULL,

  label VARCHAR(20) NOT NULL,

  CONSTRAINT pk_categories PRIMARY KEY (id),
  CONSTRAINT fk_categories_categories FOREIGN KEY (categories_id) REFERENCES categories (id)
);

CREATE TABLE descriptions
(
  id BIGINT NOT NULL AUTO_INCREMENT,
  images_id BIGINT NOT NULL,

  text VARCHAR(20) NOT NULL,

  CONSTRAINT pk_descriptions PRIMARY KEY (id),
  CONSTRAINT fk_descriptions_images FOREIGN KEY (images_id) REFERENCES images (id)
);

CREATE TABLE presentations
(
  id BIGINT NOT NULL AUTO_INCREMENT,
  images_id BIGINT NOT NULL,

  label VARCHAR(20) NOT NULL,

  CONSTRAINT pk_presentations PRIMARY KEY (id),
  CONSTRAINT fk_presentations_images FOREIGN KEY (images_id) REFERENCES images (id)
);

CREATE TABLE accounts
(
  id BIGINT NOT NULL AUTO_INCREMENT,
  credentials_id BIGINT NOT NULL,
  presentations_id BIGINT NOT NULL,

  CONSTRAINT pk_accounts PRIMARY KEY (id),
  CONSTRAINT fk_accounts_credentials FOREIGN KEY (credentials_id) REFERENCES accounts (id),
  CONSTRAINT fk_accounts_presentations FOREIGN KEY (presentations_id) REFERENCES accounts (id)
);

CREATE TABLE persons
(
  id BIGINT NOT NULL AUTO_INCREMENT,

  cash BIGINT,
  rating BIGINT NOT NULL,

  CONSTRAINT pk_persons PRIMARY KEY (id),
  CONSTRAINT fk_persons_accounts FOREIGN KEY (id) REFERENCES accounts (id)
);

CREATE TABLE instructions
(
  id BIGINT NOT NULL AUTO_INCREMENT,
  descriptions_id BIGINT NOT NULL,

  CONSTRAINT pk_instructions PRIMARY KEY (id),
  CONSTRAINT fk_instructions_descriptions FOREIGN KEY (descriptions_id) REFERENCES descriptions (id)
);

CREATE TABLE contracts
(
  id BIGINT NOT NULL AUTO_INCREMENT,
  dealer_id BIGINT NOT NULL,
  buyer_id BIGINT NOT NULL,

  label VARCHAR(20) NOT NULL,
  cash BIGINT,
  begin_date TIMESTAMP NOT NULL,
  end_date TIMESTAMP NOT NULL,
  deadline_date TIMESTAMP NOT NULL,

  CONSTRAINT pk_contracts PRIMARY KEY (id),
  CONSTRAINT fk_contracts_conflicts FOREIGN KEY (id) REFERENCES conflicts (id),
  CONSTRAINT fk_contracts_instructions FOREIGN KEY (id) REFERENCES instructions (id),
  CONSTRAINT fk_contracts_persons_d FOREIGN KEY (dealer_id) REFERENCES persons (id),
  CONSTRAINT fk_contracts_persons_b FOREIGN KEY (buyer_id) REFERENCES persons (id)
);

CREATE TABLE products
(
  id BIGINT NOT NULL AUTO_INCREMENT,
  persons_id BIGINT NOT NULL,
  descriptions_id BIGINT NOT NULL,
  instructions_id BIGINT NOT NULL,
  categories_id BIGINT NOT NULL,

  cost BIGINT,

  CONSTRAINT pk_products PRIMARY KEY (id),
  CONSTRAINT fk_products_persons FOREIGN KEY (persons_id) REFERENCES descriptions (id),
  CONSTRAINT fk_products_descriptions FOREIGN KEY (descriptions_id) REFERENCES descriptions (id),
  CONSTRAINT fk_products_instructions FOREIGN KEY (instructions_id) REFERENCES descriptions (id),
  CONSTRAINT fk_products_categories FOREIGN KEY (categories_id) REFERENCES categories (id)
);