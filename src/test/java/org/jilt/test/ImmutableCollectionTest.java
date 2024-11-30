package org.jilt.test;

import org.jilt.test.data.immutable_collection.ImmutableCollectionBuilder;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class ImmutableCollectionTest {

    @Test
    public void test_copy_collection_when_immutable_is_enable(){

        List<String> list = new ArrayList<>();
        list.add("list");

        Set<String> set = new HashSet<>();
        set.add("set");

        Map<String, String> map = new HashMap<>();
        map.put("map", "map");


        var value = ImmutableCollectionBuilder
                .immutableCollection()
                .set(set)
                .listTest(list)
                .map(map)
                .collection(set)
                .build();

        list.add("list2");

        assertThat(value.listTest).containsExactly("list");
        assertThat(value.set).containsExactly("list");
        assertThat(value.map).containsOnlyKeys("map");

    }


}
