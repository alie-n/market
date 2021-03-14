DROP TABLE IF EXISTS draft;

CREATE TABLE draft
(
  id INT,
  value VARCHAR(20)
);

INSERT INTO draft (id, value)
VALUES (1, 'draft value');

SELECT * FROM draft;