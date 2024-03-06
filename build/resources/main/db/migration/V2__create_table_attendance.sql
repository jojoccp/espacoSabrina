

CREATE TABLE IF NOT EXISTS ATTENDANCE (
    attendance_id SERIAL PRIMARY KEY,
    attendance_date VARCHAR(255),
    attendance_time VARCHAR(255),
    attendance_payment_type NUMERIC,
    attendance_procedure NUMERIC,
    client_id  SERIAL,
    CONSTRAINT fk_client_id FOREIGN KEY(client_id) REFERENCES client(client_id)
    );
