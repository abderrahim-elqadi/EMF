/**
 */
package library.impl;

import java.util.Collection;

import library.Book;
import library.Employe;
import library.Library;
import library.LibraryPackage;
import library.Writer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link library.impl.LibraryImpl#getName <em>Name</em>}</li>
 *   <li>{@link library.impl.LibraryImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link library.impl.LibraryImpl#getEmployes <em>Employes</em>}</li>
 *   <li>{@link library.impl.LibraryImpl#getWriters <em>Writers</em>}</li>
 *   <li>{@link library.impl.LibraryImpl#getBooks <em>Books</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LibraryImpl extends MinimalEObjectImpl.Container implements Library {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEmployes() <em>Employes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployes()
	 * @generated
	 * @ordered
	 */
	protected EList<Employe> employes;

	/**
	 * The cached value of the '{@link #getWriters() <em>Writers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriters()
	 * @generated
	 * @ordered
	 */
	protected EList<Writer> writers;

	/**
	 * The cached value of the '{@link #getBooks() <em>Books</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooks()
	 * @generated
	 * @ordered
	 */
	protected EList<Book> books;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.LIBRARY;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.LIBRARY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.LIBRARY__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Employe> getEmployes() {
		if (employes == null) {
			employes = new EObjectContainmentEList<Employe>(Employe.class, this, LibraryPackage.LIBRARY__EMPLOYES);
		}
		return employes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Writer> getWriters() {
		if (writers == null) {
			writers = new EObjectContainmentEList<Writer>(Writer.class, this, LibraryPackage.LIBRARY__WRITERS);
		}
		return writers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Book> getBooks() {
		if (books == null) {
			books = new EObjectContainmentEList<Book>(Book.class, this, LibraryPackage.LIBRARY__BOOKS);
		}
		return books;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LibraryPackage.LIBRARY__EMPLOYES:
				return ((InternalEList<?>)getEmployes()).basicRemove(otherEnd, msgs);
			case LibraryPackage.LIBRARY__WRITERS:
				return ((InternalEList<?>)getWriters()).basicRemove(otherEnd, msgs);
			case LibraryPackage.LIBRARY__BOOKS:
				return ((InternalEList<?>)getBooks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LibraryPackage.LIBRARY__NAME:
				return getName();
			case LibraryPackage.LIBRARY__ADDRESS:
				return getAddress();
			case LibraryPackage.LIBRARY__EMPLOYES:
				return getEmployes();
			case LibraryPackage.LIBRARY__WRITERS:
				return getWriters();
			case LibraryPackage.LIBRARY__BOOKS:
				return getBooks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LibraryPackage.LIBRARY__NAME:
				setName((String)newValue);
				return;
			case LibraryPackage.LIBRARY__ADDRESS:
				setAddress((String)newValue);
				return;
			case LibraryPackage.LIBRARY__EMPLOYES:
				getEmployes().clear();
				getEmployes().addAll((Collection<? extends Employe>)newValue);
				return;
			case LibraryPackage.LIBRARY__WRITERS:
				getWriters().clear();
				getWriters().addAll((Collection<? extends Writer>)newValue);
				return;
			case LibraryPackage.LIBRARY__BOOKS:
				getBooks().clear();
				getBooks().addAll((Collection<? extends Book>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LibraryPackage.LIBRARY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LibraryPackage.LIBRARY__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case LibraryPackage.LIBRARY__EMPLOYES:
				getEmployes().clear();
				return;
			case LibraryPackage.LIBRARY__WRITERS:
				getWriters().clear();
				return;
			case LibraryPackage.LIBRARY__BOOKS:
				getBooks().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LibraryPackage.LIBRARY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LibraryPackage.LIBRARY__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case LibraryPackage.LIBRARY__EMPLOYES:
				return employes != null && !employes.isEmpty();
			case LibraryPackage.LIBRARY__WRITERS:
				return writers != null && !writers.isEmpty();
			case LibraryPackage.LIBRARY__BOOKS:
				return books != null && !books.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", address: ");
		result.append(address);
		result.append(')');
		return result.toString();
	}

} //LibraryImpl
