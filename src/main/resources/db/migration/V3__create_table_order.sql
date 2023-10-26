
CREATE TABLE IF NOT EXISTS TB_ORDER (
    id_order SERIAL PRIMARY KEY,
    type_of_service VARCHAR(255),
    order_value NUMERIC,
    id_client NUMERIC,
    order_date VARCHAR(255),
    order_payment NUMERIC,
    payment_parcels NUMERIC,
    number_parcels NUMERIC
);
