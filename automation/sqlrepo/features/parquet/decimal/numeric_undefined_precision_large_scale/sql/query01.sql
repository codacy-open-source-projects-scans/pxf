-- @description query01 for reading undefined precision numeric with scale overflow. Values should be rounded off.
SELECT * FROM pxf_parquet_read_undefined_precision_numeric_large_scale ORDER BY description;