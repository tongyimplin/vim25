package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.PropertyFilterUpdate;
import com.vmware.vim25.UpdateSet;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateSet", propOrder = {"version", "filterSet", "truncated"})
public class UpdateSet extends DynamicData {
  @XmlElement(required = true)
  protected String version;
  
  protected List<PropertyFilterUpdate> filterSet;
  
  protected Boolean truncated;
  
  public String getVersion() {
    return this.version;
  }
  
  public void setVersion(String paramString) {
    this.version = paramString;
  }
  
  public List<PropertyFilterUpdate> getFilterSet() {
    if (this.filterSet == null)
      this.filterSet = new ArrayList<>(); 
    return this.filterSet;
  }
  
  public Boolean isTruncated() {
    return this.truncated;
  }
  
  public void setTruncated(Boolean paramBoolean) {
    this.truncated = paramBoolean;
  }
}
