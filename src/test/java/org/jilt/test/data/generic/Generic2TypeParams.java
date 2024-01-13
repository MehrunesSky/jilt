package org.jilt.test.data.generic;

import org.jilt.Builder;

public final class Generic2TypeParams<T1, T2> {
    public final T1 t1;
    public final T2 t2;

    @Builder
    public Generic2TypeParams(T1 t1, T2 t2) {
        this.t1 = t1;
        this.t2 = t2;
    }
}
