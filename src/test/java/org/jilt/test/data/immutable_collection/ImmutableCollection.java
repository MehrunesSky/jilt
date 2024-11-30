package org.jilt.test.data.immutable_collection;

import org.jilt.Builder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Builder(useImmutableCollections = true)
public class ImmutableCollection {

    public Set<String> set;

    public List<String> listTest;

    public Map<String, String> map;

    public Collection<String> collection;

    public ArrayList<String> arrayList;

    public ImmutableCollection(Set<String> set, List<String> listTest, Map<String, String> map, Collection<String> collection,
                               ArrayList<String> arrayList) {
        this.set = set;
        this.listTest = listTest;
        this.map = map;
        this.collection = collection;
        this.arrayList = arrayList;
    }
}
