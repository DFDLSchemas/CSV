CSV
====

DFDL Schemas for CSV and CSV-like data formats.

CSV stands for "Comma Separated Values". It is less a data format than a theme
for many kinds of related data formats. This schema project includes more than one 
variation. 

The basic csv.dfdl.xsd schema is portable DFDL - it runs on both IBM DFDL, and 
on the Apache Daffodil DFDL implementation.

Other variations include csvEnforceHeaders.dfdl.xsd which uses 
dfdl:occursCountKind 'expression' and DFDL's fn:count(....) function to enforce
the data rows having the same number of items as there are header titles.
 



