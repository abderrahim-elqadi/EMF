/**
 */
package library;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Book</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link library.Book#getTitle <em>Title</em>}</li>
 *   <li>{@link library.Book#getPages <em>Pages</em>}</li>
 *   <li>{@link library.Book#getCategory <em>Category</em>}</li>
 *   <li>{@link library.Book#getAuthors <em>Authors</em>}</li>
 * </ul>
 *
 * @see library.LibraryPackage#getBook()
 * @model
 * @generated
 */
public interface Book extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see library.LibraryPackage#getBook_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link library.Book#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Pages</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pages</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' attribute.
	 * @see #setPages(int)
	 * @see library.LibraryPackage#getBook_Pages()
	 * @model default="0"
	 * @generated
	 */
	int getPages();

	/**
	 * Sets the value of the '{@link library.Book#getPages <em>Pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pages</em>' attribute.
	 * @see #getPages()
	 * @generated
	 */
	void setPages(int value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The default value is <code>"ScienceFiction"</code>.
	 * The literals are from the enumeration {@link library.BookCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see library.BookCategory
	 * @see #setCategory(BookCategory)
	 * @see library.LibraryPackage#getBook_Category()
	 * @model default="ScienceFiction"
	 * @generated
	 */
	BookCategory getCategory();

	/**
	 * Sets the value of the '{@link library.Book#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see library.BookCategory
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(BookCategory value);

	/**
	 * Returns the value of the '<em><b>Authors</b></em>' reference list.
	 * The list contents are of type {@link library.Writer}.
	 * It is bidirectional and its opposite is '{@link library.Writer#getBooks <em>Books</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authors</em>' reference list.
	 * @see library.LibraryPackage#getBook_Authors()
	 * @see library.Writer#getBooks
	 * @model opposite="books" required="true"
	 * @generated
	 */
	EList<Writer> getAuthors();

} // Book
