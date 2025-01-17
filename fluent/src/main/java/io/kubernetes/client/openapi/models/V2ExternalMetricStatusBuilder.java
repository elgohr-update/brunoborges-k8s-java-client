package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V2ExternalMetricStatusBuilder extends io.kubernetes.client.openapi.models.V2ExternalMetricStatusFluentImpl<io.kubernetes.client.openapi.models.V2ExternalMetricStatusBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V2ExternalMetricStatus,io.kubernetes.client.openapi.models.V2ExternalMetricStatusBuilder>{
  public V2ExternalMetricStatusBuilder() {
    this(false);
  }
  public V2ExternalMetricStatusBuilder(java.lang.Boolean validationEnabled) {
    this(new V2ExternalMetricStatus(), validationEnabled);
  }
  public V2ExternalMetricStatusBuilder(io.kubernetes.client.openapi.models.V2ExternalMetricStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V2ExternalMetricStatusBuilder(io.kubernetes.client.openapi.models.V2ExternalMetricStatusFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V2ExternalMetricStatus(), validationEnabled);
  }
  public V2ExternalMetricStatusBuilder(io.kubernetes.client.openapi.models.V2ExternalMetricStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V2ExternalMetricStatus instance) {
    this(fluent, instance, false);
  }
  public V2ExternalMetricStatusBuilder(io.kubernetes.client.openapi.models.V2ExternalMetricStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V2ExternalMetricStatus instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withCurrent(instance.getCurrent());

    fluent.withMetric(instance.getMetric());

    this.validationEnabled = validationEnabled; 
  }
  public V2ExternalMetricStatusBuilder(io.kubernetes.client.openapi.models.V2ExternalMetricStatus instance) {
    this(instance,false);
  }
  public V2ExternalMetricStatusBuilder(io.kubernetes.client.openapi.models.V2ExternalMetricStatus instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withCurrent(instance.getCurrent());

    this.withMetric(instance.getMetric());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V2ExternalMetricStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V2ExternalMetricStatus build() {
    V2ExternalMetricStatus buildable = new V2ExternalMetricStatus();
    buildable.setCurrent(fluent.getCurrent());
    buildable.setMetric(fluent.getMetric());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V2ExternalMetricStatusBuilder that = (V2ExternalMetricStatusBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}