
CREATE TABLE IF NOT EXISTS TB_CLIENT (
    id_client SERIAL PRIMARY KEY,
    client_name VARCHAR(255),
    client_cellphone VARCHAR(255)
);