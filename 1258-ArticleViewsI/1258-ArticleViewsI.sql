-- Last updated: 8/1/2025, 8:14:27 PM
# Write your MySQL query statement below
select distinct author_id as id from Views where author_id = viewer_id order by author_id;