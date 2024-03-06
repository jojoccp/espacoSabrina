
CREATE TABLE IF NOT EXISTS ORDER_PAYMENT (
    order_id SERIAL PRIMARY KEY,
    order_type_of_service VARCHAR(255),
    order_value NUMERIC,
    order_date VARCHAR(255),
    order_payment NUMERIC,
    order_payment_parcels NUMERIC,
    order_number_parcels NUMERIC,
    client_id SERIAL,
    attendance_id SERIAL,
    CONSTRAINT fk_client_order_id FOREIGN KEY(client_id) REFERENCES client(client_id),
    CONSTRAINT fk_attendance_order_id FOREIGN KEY(attendance_id) REFERENCES attendance(attendance_id)
    );
