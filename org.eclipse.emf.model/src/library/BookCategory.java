/**
 */
package library;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Book Category</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see library.LibraryPackage#getBookCategory()
 * @model
 * @generated
 */
public enum BookCategory implements Enumerator {
	/**
	 * The '<em><b>Science Fiction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCIENCE_FICTION_VALUE
	 * @generated
	 * @ordered
	 */
	SCIENCE_FICTION(0, "ScienceFiction", "ScienceFiction"),

	/**
	 * The '<em><b>Biography</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIOGRAPHY_VALUE
	 * @generated
	 * @ordered
	 */
	BIOGRAPHY(0, "Biography", "Biography"),

	/**
	 * The '<em><b>Mistery</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MISTERY_VALUE
	 * @generated
	 * @ordered
	 */
	MISTERY(0, "Mistery", "Mistery");

	/**
	 * The '<em><b>Science Fiction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Science Fiction</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCIENCE_FICTION
	 * @model name="ScienceFiction"
	 * @generated
	 * @ordered
	 */
	public static final int SCIENCE_FICTION_VALUE = 0;

	/**
	 * The '<em><b>Biography</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Biography</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BIOGRAPHY
	 * @model name="Biography"
	 * @generated
	 * @ordered
	 */
	public static final int BIOGRAPHY_VALUE = 0;

	/**
	 * The '<em><b>Mistery</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mistery</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MISTERY
	 * @model name="Mistery"
	 * @generated
	 * @ordered
	 */
	public static final int MISTERY_VALUE = 0;

	/**
	 * An array of all the '<em><b>Book Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BookCategory[] VALUES_ARRAY =
		new BookCategory[] {
			SCIENCE_FICTION,
			BIOGRAPHY,
			MISTERY,
		};

	/**
	 * A public read-only list of all the '<em><b>Book Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BookCategory> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Book Category</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BookCategory get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BookCategory result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Book Category</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BookCategory getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BookCategory result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Book Category</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BookCategory get(int value) {
		switch (value) {
			case SCIENCE_FICTION_VALUE: return SCIENCE_FICTION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private BookCategory(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //BookCategory
