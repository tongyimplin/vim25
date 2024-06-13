package com.vmware.vim25;

import com.vmware.vim25.ClusterDasHostRecommendation;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterDasHostRecommendation", propOrder = {"host", "drsRating"})
public class ClusterDasHostRecommendation extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference host;
  
  protected Integer drsRating;
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
  
  public Integer getDrsRating() {
    return this.drsRating;
  }
  
  public void setDrsRating(Integer paramInteger) {
    this.drsRating = paramInteger;
  }
}
