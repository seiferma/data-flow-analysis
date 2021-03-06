/**
 */
package edu.kit.ipd.sdq.dataflow.systemmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.dataflow.systemmodel.Operation#getParameters <em>Parameters</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.dataflow.systemmodel.Operation#getReturnValues <em>Return Values</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.dataflow.systemmodel.Operation#getPropertyDefinitions <em>Property Definitions</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.dataflow.systemmodel.Operation#getReturnValueAssignments <em>Return Value Assignments</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.dataflow.systemmodel.Operation#getStateVariables <em>State Variables</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.dataflow.systemmodel.Operation#getDefaultStateDefinitions <em>Default State Definitions</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.dataflow.systemmodel.Operation#getPostExecutionStateDefinitions <em>Post Execution State Definitions</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage#getOperation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='parameterNamesUnique returnValueNamesUnique stateNamesUnique noDuplicatePropertyDefinitions noCyclesInCallGraph onlyConstantDefaultStateDefinitions'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot parameterNamesUnique='parameters-&gt;isUnique(name)' returnValueNamesUnique='returnValues-&gt;isUnique(name)' stateNamesUnique='stateVariables-&gt;isUnique(name)' noDuplicatePropertyDefinitions='propertyDefinitions-&gt;isUnique(property)' noCyclesInCallGraph=' self.calls-&gt;closure(call | call.callee.calls).callee-&gt;excludes(self)' onlyConstantDefaultStateDefinitions='defaultStateDefinitions.term-&gt;closure(t | t.oclContents())-&gt;forAll(\n\t\t\toclIsKindOf(True) or oclIsKindOf(False) or\n\t\t\toclIsKindOf(And) or oclIsKindOf(Or) or oclIsKindOf(Not) or\n\t\t\toclIsKindOf(PropertyRef)\n\t\t)'"
 * @generated
 */
public interface Operation extends Caller {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.dataflow.systemmodel.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage#getOperation_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getParameters();

	/**
	 * Returns the value of the '<em><b>Return Values</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.dataflow.systemmodel.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Values</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage#getOperation_ReturnValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getReturnValues();

	/**
	 * Returns the value of the '<em><b>Property Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.dataflow.systemmodel.PropertyDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Definitions</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage#getOperation_PropertyDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertyDefinition> getPropertyDefinitions();

	/**
	 * Returns the value of the '<em><b>Return Value Assignments</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.dataflow.systemmodel.VariableAssignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Value Assignments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Value Assignments</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage#getOperation_ReturnValueAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableAssignment> getReturnValueAssignments();

	/**
	 * Returns the value of the '<em><b>State Variables</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.dataflow.systemmodel.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Variables</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage#getOperation_StateVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getStateVariables();

	/**
	 * Returns the value of the '<em><b>Default State Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.dataflow.systemmodel.VariableAssignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default State Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default State Definitions</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage#getOperation_DefaultStateDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableAssignment> getDefaultStateDefinitions();

	/**
	 * Returns the value of the '<em><b>Post Execution State Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.dataflow.systemmodel.VariableAssignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Execution State Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Execution State Definitions</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.dataflow.systemmodel.SystemModelPackage#getOperation_PostExecutionStateDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableAssignment> getPostExecutionStateDefinitions();

} // Operation
