-- @description query01 for JDBC query with enum by partitioning
SET timezone='utc';

SELECT * FROM pxf_jdbc_multiple_fragments_by_enum ORDER BY t1;