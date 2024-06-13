package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.QueryPhysicalVsanDisksRequestType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryPhysicalVsanDisksRequestType", propOrder = {"_this", "props"})
public class QueryPhysicalVsanDisksRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected List<String> props;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<String> getProps() {
    if (this.props == null)
      this.props = new ArrayList<>(); 
    return this.props;
  }
}
