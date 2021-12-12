/**
 * generated by Xtext 2.25.0
 */
package de.raytracer.rtdsl.rayTracerModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.raytracer.rtdsl.rayTracerModel.RayTracerModelPackage
 * @generated
 */
public interface RayTracerModelFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RayTracerModelFactory eINSTANCE = de.raytracer.rtdsl.rayTracerModel.impl.RayTracerModelFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Box</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Box</em>'.
   * @generated
   */
  Box createBox();

  /**
   * Returns a new object of class '<em>Sphere</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sphere</em>'.
   * @generated
   */
  Sphere createSphere();

  /**
   * Returns a new object of class '<em>Camera</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Camera</em>'.
   * @generated
   */
  Camera createCamera();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  RayTracerModelPackage getRayTracerModelPackage();

} //RayTracerModelFactory
