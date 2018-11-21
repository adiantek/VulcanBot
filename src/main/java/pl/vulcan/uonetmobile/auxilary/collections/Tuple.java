package pl.vulcan.uonetmobile.auxilary.collections;

import java.io.Serializable;

public abstract class Tuple<K extends Serializable, V extends Serializable> implements Serializable, Comparable<Tuple<K, V>> {
    protected K a;
    protected V b;

    public Tuple(K k, V v) {
        this.a = k;
        this.b = v;
    }

    public K a() {
        return this.a;
    }

    public void a(V v) {
        this.b = v;
    }

    public V b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof Tuple)) {
            return false;
        }
        Tuple tuple = (Tuple) obj;
        if (this.a.equals(tuple.a) && this.b.equals(tuple.b)) {
            z = true;
        }
        return z;
    }
}
