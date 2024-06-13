package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ObjectSpec;
import com.vmware.vim25.PropertyFilterSpec;
import com.vmware.vim25.PropertySpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyFilterSpec", propOrder = {"propSet", "objectSet", "reportMissingObjectsInResults"})
public class PropertyFilterSpec extends DynamicData {
  @XmlElement(required = true)
  protected List<PropertySpec> propSet;
  
  @XmlElement(required = true)
  protected List<ObjectSpec> objectSet;
  
  protected Boolean reportMissingObjectsInResults;
  
  public List<PropertySpec> getPropSet() {
    if (this.propSet == null)
      this.propSet = new ArrayList<>(); 
    return this.propSet;
  }
  
  public List<ObjectSpec> getObjectSet() {
    if (this.objectSet == null)
      this.objectSet = new ArrayList<>(); 
    return this.objectSet;
  }
  
  public Boolean isReportMissingObjectsInResults() {
    return this.reportMissingObjectsInResults;
  }
  
  public void setReportMissingObjectsInResults(Boolean paramBoolean) {
    this.reportMissingObjectsInResults = paramBoolean;
  }
}
