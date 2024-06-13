package com.vmware.vim25;

import com.vmware.vim25.ClusterDasConfigInfoHBDatastoreCandidate;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ClusterDasConfigInfoHBDatastoreCandidate")
@XmlEnum
public enum ClusterDasConfigInfoHBDatastoreCandidate {
  USER_SELECTED_DS("userSelectedDs"),
  ALL_FEASIBLE_DS("allFeasibleDs"),
  ALL_FEASIBLE_DS_WITH_USER_PREFERENCE("allFeasibleDsWithUserPreference");
  
  private final String value;
  
  ClusterDasConfigInfoHBDatastoreCandidate(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static ClusterDasConfigInfoHBDatastoreCandidate fromValue(String paramString) {
    for (ClusterDasConfigInfoHBDatastoreCandidate clusterDasConfigInfoHBDatastoreCandidate : values()) {
      if (clusterDasConfigInfoHBDatastoreCandidate.value.equals(paramString))
        return clusterDasConfigInfoHBDatastoreCandidate; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
