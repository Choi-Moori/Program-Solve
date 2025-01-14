SELECT 
    YEAR(differentiation_date) AS year,
    (select Max(size_of_colony) 
     from ecoli_data 
     where year(differentiation_date) = year)- size_of_colony as year_dev,
    id
FROM ecoli_data
order by year, year_dev
