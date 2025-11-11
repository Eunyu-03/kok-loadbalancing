create table tbl_retrieved_intern(
    id bigint generated always as identity
        primary key,
    member_id bigint not null
        constraint fk_retrieved_intern_member
        references tbl_member(user_id),
    intern_id bigint not null
        constraint fk_retrieved_intern_intern
        references tbl_intern_notice(id)
);