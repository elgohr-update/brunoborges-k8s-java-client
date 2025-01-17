package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1beta2GroupSubjectBuilder extends io.kubernetes.client.openapi.models.V1beta2GroupSubjectFluentImpl<io.kubernetes.client.openapi.models.V1beta2GroupSubjectBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta2GroupSubject,io.kubernetes.client.openapi.models.V1beta2GroupSubjectBuilder>{
  public V1beta2GroupSubjectBuilder() {
    this(false);
  }
  public V1beta2GroupSubjectBuilder(java.lang.Boolean validationEnabled) {
    this(new V1beta2GroupSubject(), validationEnabled);
  }
  public V1beta2GroupSubjectBuilder(io.kubernetes.client.openapi.models.V1beta2GroupSubjectFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta2GroupSubjectBuilder(io.kubernetes.client.openapi.models.V1beta2GroupSubjectFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta2GroupSubject(), validationEnabled);
  }
  public V1beta2GroupSubjectBuilder(io.kubernetes.client.openapi.models.V1beta2GroupSubjectFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta2GroupSubject instance) {
    this(fluent, instance, false);
  }
  public V1beta2GroupSubjectBuilder(io.kubernetes.client.openapi.models.V1beta2GroupSubjectFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta2GroupSubject instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta2GroupSubjectBuilder(io.kubernetes.client.openapi.models.V1beta2GroupSubject instance) {
    this(instance,false);
  }
  public V1beta2GroupSubjectBuilder(io.kubernetes.client.openapi.models.V1beta2GroupSubject instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1beta2GroupSubjectFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1beta2GroupSubject build() {
    V1beta2GroupSubject buildable = new V1beta2GroupSubject();
    buildable.setName(fluent.getName());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta2GroupSubjectBuilder that = (V1beta2GroupSubjectBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}