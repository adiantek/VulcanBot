package pl.vulcan.uonetmobile.model.entities;

import java.io.Serializable;

public interface IModel<T> extends Serializable, Comparable<T> {
	boolean c();
}
