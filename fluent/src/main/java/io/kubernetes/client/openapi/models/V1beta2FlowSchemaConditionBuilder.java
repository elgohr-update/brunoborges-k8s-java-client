package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1beta2FlowSchemaConditionBuilder extends io.kubernetes.client.openapi.models.V1beta2FlowSchemaConditionFluentImpl<io.kubernetes.client.openapi.models.V1beta2FlowSchemaConditionBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta2FlowSchemaCondition,io.kubernetes.client.openapi.models.V1beta2FlowSchemaConditionBuilder>{
  public V1beta2FlowSchemaConditionBuilder() {
    this(false);
  }
  public V1beta2FlowSchemaConditionBuilder(java.lang.Boolean validationEnabled) {
    this(new V1beta2FlowSchemaCondition(), validationEnabled);
  }
  public V1beta2FlowSchemaConditionBuilder(io.kubernetes.client.openapi.models.V1beta2FlowSchemaConditionFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta2FlowSchemaConditionBuilder(io.kubernetes.client.openapi.models.V1beta2FlowSchemaConditionFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta2FlowSchemaCondition(), validationEnabled);
  }
  public V1beta2FlowSchemaConditionBuilder(io.kubernetes.client.openapi.models.V1beta2FlowSchemaConditionFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta2FlowSchemaCondition instance) {
    this(fluent, instance, false);
  }
  public V1beta2FlowSchemaConditionBuilder(io.kubernetes.client.openapi.models.V1beta2FlowSchemaConditionFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta2FlowSchemaCondition instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withLastTransitionTime(instance.getLastTransitionTime());

    fluent.withMessage(instance.getMessage());

    fluent.withReason(instance.getReason());

    fluent.withStatus(instance.getStatus());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta2FlowSchemaConditionBuilder(io.kubernetes.client.openapi.models.V1beta2FlowSchemaCondition instance) {
    this(instance,false);
  }
  public V1beta2FlowSchemaConditionBuilder(io.kubernetes.client.openapi.models.V1beta2FlowSchemaCondition instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withLastTransitionTime(instance.getLastTransitionTime());

    this.withMessage(instance.getMessage());

    this.withReason(instance.getReason());

    this.withStatus(instance.getStatus());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1beta2FlowSchemaConditionFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaCondition build() {
    V1beta2FlowSchemaCondition buildable = new V1beta2FlowSchemaCondition();
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta2FlowSchemaConditionBuilder that = (V1beta2FlowSchemaConditionBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}