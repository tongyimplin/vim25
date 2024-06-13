package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VslmCreateSpecBackingSpec;
import com.vmware.vim25.VslmCreateSpecDiskFileBackingSpec;
import com.vmware.vim25.VslmCreateSpecRawDiskMappingBackingSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VslmCreateSpecBackingSpec", propOrder = {"datastore", "path"})
@XmlSeeAlso({VslmCreateSpecRawDiskMappingBackingSpec.class, VslmCreateSpecDiskFileBackingSpec.class})
public class VslmCreateSpecBackingSpec extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference datastore;
  
  protected String path;
  
  public ManagedObjectReference getDatastore() {
    return this.datastore;
  }
  
  public void setDatastore(ManagedObjectReference paramManagedObjectReference) {
    this.datastore = paramManagedObjectReference;
  }
  
  public String getPath() {
    return this.path;
  }
  
  public void setPath(String paramString) {
    this.path = paramString;
  }
}
