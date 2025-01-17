package com.palantir.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.palantir.conjure.java.lib.internal.ConjureCollections;
import com.palantir.logsafe.Preconditions;
import com.palantir.logsafe.SafeArg;
import com.palantir.logsafe.exceptions.SafeIllegalArgumentException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;

@JsonDeserialize(builder = ListExample.Builder.class)
@Generated("com.palantir.conjure.java.types.BeanGenerator")
public final class ListExample {
    private final List<String> items;

    private final List<Integer> primitiveItems;

    private final List<Double> doubleItems;

    private volatile int memoizedHashCode;

    private ListExample(
            List<String> items, List<Integer> primitiveItems, List<Double> doubleItems) {
        validateFields(items, primitiveItems, doubleItems);
        this.items = Collections.unmodifiableList(items);
        this.primitiveItems = Collections.unmodifiableList(primitiveItems);
        this.doubleItems = Collections.unmodifiableList(doubleItems);
    }

    @JsonProperty("items")
    public List<String> getItems() {
        return this.items;
    }

    @JsonProperty("primitiveItems")
    public List<Integer> getPrimitiveItems() {
        return this.primitiveItems;
    }

    @JsonProperty("doubleItems")
    public List<Double> getDoubleItems() {
        return this.doubleItems;
    }

    @Override
    public boolean equals(Object other) {
        return this == other || (other instanceof ListExample && equalTo((ListExample) other));
    }

    private boolean equalTo(ListExample other) {
        return this.items.equals(other.items)
                && this.primitiveItems.equals(other.primitiveItems)
                && this.doubleItems.equals(other.doubleItems);
    }

    @Override
    public int hashCode() {
        int result = memoizedHashCode;
        if (result == 0) {
            result = Objects.hash(this.items, this.primitiveItems, this.doubleItems);
            memoizedHashCode = result;
        }
        return result;
    }

    @Override
    public String toString() {
        return "ListExample{items: "
                + items
                + ", primitiveItems: "
                + primitiveItems
                + ", doubleItems: "
                + doubleItems
                + '}';
    }

    public static ListExample of(
            List<String> items, List<Integer> primitiveItems, List<Double> doubleItems) {
        return builder()
                .items(items)
                .primitiveItems(primitiveItems)
                .doubleItems(doubleItems)
                .build();
    }

    private static void validateFields(
            List<String> items, List<Integer> primitiveItems, List<Double> doubleItems) {
        List<String> missingFields = null;
        missingFields = addFieldIfMissing(missingFields, items, "items");
        missingFields = addFieldIfMissing(missingFields, primitiveItems, "primitiveItems");
        missingFields = addFieldIfMissing(missingFields, doubleItems, "doubleItems");
        if (missingFields != null) {
            throw new SafeIllegalArgumentException(
                    "Some required fields have not been set",
                    SafeArg.of("missingFields", missingFields));
        }
    }

    private static List<String> addFieldIfMissing(
            List<String> prev, Object fieldValue, String fieldName) {
        List<String> missingFields = prev;
        if (fieldValue == null) {
            if (missingFields == null) {
                missingFields = new ArrayList<>(3);
            }
            missingFields.add(fieldName);
        }
        return missingFields;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Generated("com.palantir.conjure.java.types.BeanBuilderGenerator")
    public static final class Builder {
        private List<String> items = new ArrayList<>();

        private List<Integer> primitiveItems = new ArrayList<>();

        private List<Double> doubleItems = new ArrayList<>();

        private Builder() {}

        public Builder from(ListExample other) {
            items(other.getItems());
            primitiveItems(other.getPrimitiveItems());
            doubleItems(other.getDoubleItems());
            return this;
        }

        @JsonSetter(value = "items", nulls = Nulls.SKIP)
        public Builder items(Iterable<String> items) {
            this.items.clear();
            ConjureCollections.addAll(
                    this.items, Preconditions.checkNotNull(items, "items cannot be null"));
            return this;
        }

        public Builder addAllItems(Iterable<String> items) {
            ConjureCollections.addAll(
                    this.items, Preconditions.checkNotNull(items, "items cannot be null"));
            return this;
        }

        public Builder items(String items) {
            this.items.add(items);
            return this;
        }

        @JsonSetter(value = "primitiveItems", nulls = Nulls.SKIP)
        public Builder primitiveItems(Iterable<Integer> primitiveItems) {
            this.primitiveItems.clear();
            ConjureCollections.addAll(
                    this.primitiveItems,
                    Preconditions.checkNotNull(primitiveItems, "primitiveItems cannot be null"));
            return this;
        }

        public Builder addAllPrimitiveItems(Iterable<Integer> primitiveItems) {
            ConjureCollections.addAll(
                    this.primitiveItems,
                    Preconditions.checkNotNull(primitiveItems, "primitiveItems cannot be null"));
            return this;
        }

        public Builder primitiveItems(int primitiveItems) {
            this.primitiveItems.add(primitiveItems);
            return this;
        }

        @JsonSetter(value = "doubleItems", nulls = Nulls.SKIP)
        public Builder doubleItems(Iterable<Double> doubleItems) {
            this.doubleItems.clear();
            ConjureCollections.addAll(
                    this.doubleItems,
                    Preconditions.checkNotNull(doubleItems, "doubleItems cannot be null"));
            return this;
        }

        public Builder addAllDoubleItems(Iterable<Double> doubleItems) {
            ConjureCollections.addAll(
                    this.doubleItems,
                    Preconditions.checkNotNull(doubleItems, "doubleItems cannot be null"));
            return this;
        }

        public Builder doubleItems(double doubleItems) {
            this.doubleItems.add(doubleItems);
            return this;
        }

        public ListExample build() {
            return new ListExample(items, primitiveItems, doubleItems);
        }
    }
}
