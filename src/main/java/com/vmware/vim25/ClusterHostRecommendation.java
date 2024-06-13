package com.vmware.vim25;

import com.vmware.vim25.ClusterHostRecommendation;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterHostRecommendation", propOrder = {"host", "rating"})
public class ClusterHostRecommendation extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference host;
  
  protected int rating;
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
  
  public int getRating() {
    return this.rating;
  }
  
  public void setRating(int paramInt) {
    this.rating = paramInt;
  }
}
