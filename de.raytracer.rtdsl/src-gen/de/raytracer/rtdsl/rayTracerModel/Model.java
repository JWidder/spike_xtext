/**
 * generated by Xtext 2.25.0
 */
package de.raytracer.rtdsl.rayTracerModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.raytracer.rtdsl.rayTracerModel.Model#getName <em>Name</em>}</li>
 *   <li>{@link de.raytracer.rtdsl.rayTracerModel.Model#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see de.raytracer.rtdsl.rayTracerModel.RayTracerModelPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.raytracer.rtdsl.rayTracerModel.RayTracerModelPackage#getModel_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.raytracer.rtdsl.rayTracerModel.Model#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Element</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' containment reference list.
   * @see de.raytracer.rtdsl.rayTracerModel.RayTracerModelPackage#getModel_Element()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getElement();

} // Model
