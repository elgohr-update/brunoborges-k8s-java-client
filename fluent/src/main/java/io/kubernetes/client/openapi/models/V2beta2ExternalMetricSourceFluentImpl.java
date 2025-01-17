package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

 /**
  * Generated
  */
public class V2beta2ExternalMetricSourceFluentImpl<A extends io.kubernetes.client.openapi.models.V2beta2ExternalMetricSourceFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V2beta2ExternalMetricSourceFluent<A>{
  public V2beta2ExternalMetricSourceFluentImpl() {
  }
  public V2beta2ExternalMetricSourceFluentImpl(io.kubernetes.client.openapi.models.V2beta2ExternalMetricSource instance) {
    this.withMetric(instance.getMetric());

    this.withTarget(instance.getTarget());

  }
  private io.kubernetes.client.openapi.models.V2beta2MetricIdentifierBuilder metric;
  private io.kubernetes.client.openapi.models.V2beta2MetricTargetBuilder target;
  
  /**
   * This method has been deprecated, please use method buildMetric instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V2beta2MetricIdentifier getMetric() {
    return this.metric!=null ?this.metric.build():null;
  }
  public io.kubernetes.client.openapi.models.V2beta2MetricIdentifier buildMetric() {
    return this.metric!=null ?this.metric.build():null;
  }
  public A withMetric(io.kubernetes.client.openapi.models.V2beta2MetricIdentifier metric) {
    _visitables.get("metric").remove(this.metric);
    if (metric!=null){ this.metric= new io.kubernetes.client.openapi.models.V2beta2MetricIdentifierBuilder(metric); _visitables.get("metric").add(this.metric);} return (A) this;
  }
  public java.lang.Boolean hasMetric() {
    return this.metric != null;
  }
  public io.kubernetes.client.openapi.models.V2beta2ExternalMetricSourceFluent.MetricNested<A> withNewMetric() {
    return new io.kubernetes.client.openapi.models.V2beta2ExternalMetricSourceFluentImpl.MetricNestedImpl();
  }
  public io.kubernetes.client.openapi.models.V2beta2ExternalMetricSourceFluent.MetricNested<A> withNewMetricLike(io.kubernetes.client.openapi.models.V2beta2MetricIdentifier item) {
    return new io.kubernetes.client.openapi.models.V2beta2ExternalMetricSourceFluentImpl.MetricNestedImpl(item);
  }
  public io.kubernetes.client.openapi.models.V2beta2ExternalMetricSourceFluent.MetricNested<A> editMetric() {
    return withNewMetricLike(getMetric());
  }
  public io.kubernetes.client.openapi.models.V2beta2ExternalMetricSourceFluent.MetricNested<A> editOrNewMetric() {
    return withNewMetricLike(getMetric() != null ? getMetric(): new io.kubernetes.client.openapi.models.V2beta2MetricIdentifierBuilder().build());
  }
  public io.kubernetes.client.openapi.models.V2beta2ExternalMetricSourceFluent.MetricNested<A> editOrNewMetricLike(io.kubernetes.client.openapi.models.V2beta2MetricIdentifier item) {
    return withNewMetricLike(getMetric() != null ? getMetric(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildTarget instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V2beta2MetricTarget getTarget() {
    return this.target!=null ?this.target.build():null;
  }
  public io.kubernetes.client.openapi.models.V2beta2MetricTarget buildTarget() {
    return this.target!=null ?this.target.build():null;
  }
  public A withTarget(io.kubernetes.client.openapi.models.V2beta2MetricTarget target) {
    _visitables.get("target").remove(this.target);
    if (target!=null){ this.target= new io.kubernetes.client.openapi.models.V2beta2MetricTargetBuilder(target); _visitables.get("target").add(this.target);} return (A) this;
  }
  public java.lang.Boolean hasTarget() {
    return this.target != null;
  }
  public io.kubernetes.client.openapi.models.V2beta2ExternalMetricSourceFluent.TargetNested<A> withNewTarget() {
    return new io.kubernetes.client.openapi.models.V2beta2ExternalMetricSourceFluentImpl.TargetNestedImpl();
  }
  public io.kubernetes.client.openapi.models.V2beta2ExternalMetricSourceFluent.TargetNested<A> withNewTargetLike(io.kubernetes.client.openapi.models.V2beta2MetricTarget item) {
    return new io.kubernetes.client.openapi.models.V2beta2ExternalMetricSourceFluentImpl.TargetNestedImpl(item);
  }
  public io.kubernetes.client.openapi.models.V2beta2ExternalMetricSourceFluent.TargetNested<A> editTarget() {
    return withNewTargetLike(getTarget());
  }
  public io.kubernetes.client.openapi.models.V2beta2ExternalMetricSourceFluent.TargetNested<A> editOrNewTarget() {
    return withNewTargetLike(getTarget() != null ? getTarget(): new io.kubernetes.client.openapi.models.V2beta2MetricTargetBuilder().build());
  }
  public io.kubernetes.client.openapi.models.V2beta2ExternalMetricSourceFluent.TargetNested<A> editOrNewTargetLike(io.kubernetes.client.openapi.models.V2beta2MetricTarget item) {
    return withNewTargetLike(getTarget() != null ? getTarget(): item);
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V2beta2ExternalMetricSourceFluentImpl that = (V2beta2ExternalMetricSourceFluentImpl) o;
    if (metric != null ? !metric.equals(that.metric) :that.metric != null) return false;
    if (target != null ? !target.equals(that.target) :that.target != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(metric,  target,  super.hashCode());
  }
  public class MetricNestedImpl<N> extends io.kubernetes.client.openapi.models.V2beta2MetricIdentifierFluentImpl<io.kubernetes.client.openapi.models.V2beta2ExternalMetricSourceFluent.MetricNested<N>> implements io.kubernetes.client.openapi.models.V2beta2ExternalMetricSourceFluent.MetricNested<N>,io.kubernetes.client.fluent.Nested<N>{
    MetricNestedImpl(io.kubernetes.client.openapi.models.V2beta2MetricIdentifier item) {
      this.builder = new io.kubernetes.client.openapi.models.V2beta2MetricIdentifierBuilder(this, item);
    }
    MetricNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V2beta2MetricIdentifierBuilder(this);
    }
    io.kubernetes.client.openapi.models.V2beta2MetricIdentifierBuilder builder;
    public N and() {
      return (N) V2beta2ExternalMetricSourceFluentImpl.this.withMetric(builder.build());
    }
    public N endMetric() {
      return and();
    }
    
  }
  public class TargetNestedImpl<N> extends io.kubernetes.client.openapi.models.V2beta2MetricTargetFluentImpl<io.kubernetes.client.openapi.models.V2beta2ExternalMetricSourceFluent.TargetNested<N>> implements io.kubernetes.client.openapi.models.V2beta2ExternalMetricSourceFluent.TargetNested<N>,io.kubernetes.client.fluent.Nested<N>{
    TargetNestedImpl(io.kubernetes.client.openapi.models.V2beta2MetricTarget item) {
      this.builder = new io.kubernetes.client.openapi.models.V2beta2MetricTargetBuilder(this, item);
    }
    TargetNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V2beta2MetricTargetBuilder(this);
    }
    io.kubernetes.client.openapi.models.V2beta2MetricTargetBuilder builder;
    public N and() {
      return (N) V2beta2ExternalMetricSourceFluentImpl.this.withTarget(builder.build());
    }
    public N endTarget() {
      return and();
    }
    
  }
  
}