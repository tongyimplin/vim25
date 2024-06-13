package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostLicensableResourceInfo;
import com.vmware.vim25.KeyAnyValue;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostLicensableResourceInfo", propOrder = {"resource"})
public class HostLicensableResourceInfo extends DynamicData {
  @XmlElement(required = true)
  protected List<KeyAnyValue> resource;
  
  public List<KeyAnyValue> getResource() {
    if (this.resource == null)
      this.resource = new ArrayList<>(); 
    return this.resource;
  }
}
