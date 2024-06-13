package com.vmware.vim25;

import com.vmware.vim25.ClusterDrsMigration;
import com.vmware.vim25.ClusterDrsRecommendation;
import com.vmware.vim25.DynamicData;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterDrsRecommendation", propOrder = {"key", "rating", "reason", "reasonText", "migrationList"})
public class ClusterDrsRecommendation extends DynamicData {
  @XmlElement(required = true)
  protected String key;
  
  protected int rating;
  
  @XmlElement(required = true)
  protected String reason;
  
  @XmlElement(required = true)
  protected String reasonText;
  
  @XmlElement(required = true)
  protected List<ClusterDrsMigration> migrationList;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public int getRating() {
    return this.rating;
  }
  
  public void setRating(int paramInt) {
    this.rating = paramInt;
  }
  
  public String getReason() {
    return this.reason;
  }
  
  public void setReason(String paramString) {
    this.reason = paramString;
  }
  
  public String getReasonText() {
    return this.reasonText;
  }
  
  public void setReasonText(String paramString) {
    this.reasonText = paramString;
  }
  
  public List<ClusterDrsMigration> getMigrationList() {
    if (this.migrationList == null)
      this.migrationList = new ArrayList<>(); 
    return this.migrationList;
  }
}
