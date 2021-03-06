/**
 */
package edu.kit.ipd.sdq.dataflow.systemmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default State Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Main purpose is to allow the Translator to defined state assignments prior to performing the translation.
 * This class should usually not be used when defining models.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.dataflow.systemmodel.DefaultStateRef#getStateVariable <em>State Variable</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.dataflow.systemmodel.DefaultStateRef#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.dataflow.systemmodel.DefaultStateRef#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage#getDefaultStateRef()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='isStateVariableValid isAttributeValid isValueValid'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot isStateVariableValid='getPossibleVariables()-&gt;includes(stateVariable)' isAttributeValid='getPossibleAttributes()-&gt;includes(attribute)' isValueValid='getPossibleValues()-&gt;includes(value)'"
 * @generated
 */
public interface DefaultStateRef extends LogicTerm {
	/**
	 * Returns the value of the '<em><b>State Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Variable</em>' reference.
	 * @see #setStateVariable(Variable)
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage#getDefaultStateRef_StateVariable()
	 * @model required="true"
	 * @generated
	 */
	Variable getStateVariable();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.DefaultStateRef#getStateVariable <em>State Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Variable</em>' reference.
	 * @see #getStateVariable()
	 * @generated
	 */
	void setStateVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(Attribute)
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage#getDefaultStateRef_Attribute()
	 * @model
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.DefaultStateRef#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(Value)
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage#getDefaultStateRef_Value()
	 * @model
	 * @generated
	 */
	Value getValue();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.dataflow.systemmodel.DefaultStateRef#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Value value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\tOperation.allInstances().stateVariables-&gt;asSet()'"
	 * @generated
	 */
	EList<Variable> getPossibleVariables();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\tif stateVariable.oclIsUndefined() then\n\t\t\t\t\tgetPossibleVariables().datatype.attributes-&gt;asSet()-&gt;union(Set{null})\n\t\t\t\telse\n\t\t\t\t\tstateVariable.datatype.attributes-&gt;asSet()-&gt;union(Set{null})\n\t\t\t\tendif'"
	 * @generated
	 */
	EList<Attribute> getPossibleAttributes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\tif attribute.oclIsUndefined() then\n\t\t\t\t\tgetPossibleAttributes()-&gt;reject(oclIsUndefined()).type.values-&gt;asSet()-&gt;union(Set{null})\n\t\t\t\telse\n\t\t\t\t\tattribute.type.values-&gt;asSet()-&gt;union(Set{null})\n\t\t\t\tendif'"
	 * @generated
	 */
	EList<Value> getPossibleValues();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\tattribute.oclIsUndefined()'"
	 * @generated
	 */
	boolean isAttributeWildcard();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\t\tvalue.oclIsUndefined()'"
	 * @generated
	 */
	boolean isValueWildcard();

} // DefaultStateRef
