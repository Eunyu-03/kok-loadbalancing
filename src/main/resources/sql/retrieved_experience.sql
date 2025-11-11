create table tbl_retrieved_experience(
    id bigint generated always as identity
        primary key,
    member_id bigint not null
        constraint fk_retrieved_experience_member
        references tbl_member(user_id),
    experience_id bigint not null
        constraint fk_retrieved_experience_experience
        references tbl_experience_notice(id)
);