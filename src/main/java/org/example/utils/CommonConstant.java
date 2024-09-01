package org.example.utils;

import lombok.experimental.UtilityClass;

@UtilityClass
public class CommonConstant {

    public class Rest {
        public static class URI {
            public static final String BOOK = "/book";
            public static final String AUTHOR = "/author";
            public static final String ALL = "/all";
        }
    }

    public class Mapper {
        public static class Book {
            public static final String ID = "id";
            public static final String NAME = "name";
            public static final String DTO_NAME = "bookDto.name";
            public static final String DESCRIPTION = "description";
            public static final String DTO_DESCRIPTION = "bookDto.description";
            public static final String AUTHOR = "author";
        }

        public static class Author {
            public static final String FIRST_NAME = "firstName";
            public static final String LAST_NAME = "lastName";
            public static final String DTO_FIRST_NAME = "authorDto.firstName";
            public static final String DTO_LAST_NAME = "authorDto.lastName";
            public static final String BOOKS = "books";
        }
    }

    public class Database {
        public static class Table {

        }
    }
}
