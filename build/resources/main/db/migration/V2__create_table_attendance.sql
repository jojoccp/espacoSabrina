
CREATE TABLE IF NOT EXISTS TB_ATTENDANCE (
    id_attendance SERIAL PRIMARY KEY,
    procedure VARCHAR(255),
    value NUMERIC,
    attendance_date VARCHAR(255),
    client_name VARCHAR(255),
    payment_type VARCHAR(255)
);