# List (java.util.List)

* Implementation classes of List interface :-
	
	a. ArrayList 
	b. LinkedList
	c. Vector
	d. Stack

List interface common properties:-

1.  All List interface implementation classes allows null insertion.
2.  All classes allows duplicate objects.
3. 	All classes preserved insertion order

## List interface methods

1. Use the following command to get all the methods of List interface 

	javap java.util.List; 
	
	public interface java.util.List<E> extends java.util.Collection<E> {
	  public abstract int size();
	  public abstract boolean isEmpty();
	  public abstract boolean contains(java.lang.Object);
	  public abstract java.util.Iterator<E> iterator();
	  public abstract java.lang.Object[] toArray();
	  public abstract <T> T[] toArray(T[]);
	  public abstract boolean add(E);
	  public abstract boolean remove(java.lang.Object);
	  public abstract boolean containsAll(java.util.Collection<?>);
	  public abstract boolean addAll(java.util.Collection<? extends E>);
	  public abstract boolean addAll(int, java.util.Collection<? extends E>);
	  public abstract boolean removeAll(java.util.Collection<?>);
	  public abstract boolean retainAll(java.util.Collection<?>);
	  public void replaceAll(java.util.function.UnaryOperator<E>);
	  public void sort(java.util.Comparator<? super E>);
	  public abstract void clear();
	  public abstract boolean equals(java.lang.Object);
	  public abstract int hashCode();
	  public abstract E get(int);
	  public abstract E set(int, E);
	  public abstract void add(int, E);
	  public abstract E remove(int);
	  public abstract int indexOf(java.lang.Object);
	  public abstract int lastIndexOf(java.lang.Object);
	  public abstract java.util.ListIterator<E> listIterator();
	  public abstract java.util.ListIterator<E> listIterator(int);
	  public abstract java.util.List<E> subList(int, int);
	  public java.util.Spliterator<E> spliterator();
	  public static <E> java.util.List<E> of();
	  public static <E> java.util.List<E> of(E);
	  public static <E> java.util.List<E> of(E, E);
	  public static <E> java.util.List<E> of(E, E, E);
	  public static <E> java.util.List<E> of(E, E, E, E);
	  public static <E> java.util.List<E> of(E, E, E, E, E);
	  public static <E> java.util.List<E> of(E, E, E, E, E, E);
	  public static <E> java.util.List<E> of(E, E, E, E, E, E, E);
	  public static <E> java.util.List<E> of(E, E, E, E, E, E, E, E);
	  public static <E> java.util.List<E> of(E, E, E, E, E, E, E, E, E);
	  public static <E> java.util.List<E> of(E, E, E, E, E, E, E, E, E, E);
	  public static <E> java.util.List<E> of(E...);
	  public static <E> java.util.List<E> copyOf(java.util.Collection<? extends E>);
	}

## Reference Links
1. [collection-framework-in-java](https://www.benchresources.net/collection-framework-in-java/ "benchresources") 

![collectionhierarchy.jpg](collectionhierarchy.jpg "collectionhierarchy") 
  
--- 

![02-Java-collection-framework-hierarchy](02-Java-collection-framework-hierarchy.png "02-Java-collection-framework-hierarchy") 
	
