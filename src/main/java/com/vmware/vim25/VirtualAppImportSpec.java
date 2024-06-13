package com.vmware.vim25;

import com.vmware.vim25.ImportSpec;
import com.vmware.vim25.ResourceConfigSpec;
import com.vmware.vim25.VAppConfigSpec;
import com.vmware.vim25.VirtualAppImportSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualAppImportSpec", propOrder = {"name", "vAppConfigSpec", "resourcePoolSpec", "child"})
public class VirtualAppImportSpec extends ImportSpec {
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  protected VAppConfigSpec vAppConfigSpec;
  
  @XmlElement(required = true)
  protected ResourceConfigSpec resourcePoolSpec;
  
  protected List<ImportSpec> child;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public VAppConfigSpec getVAppConfigSpec() {
    return this.vAppConfigSpec;
  }
  
  public void setVAppConfigSpec(VAppConfigSpec paramVAppConfigSpec) {
    this.vAppConfigSpec = paramVAppConfigSpec;
  }
  
  public ResourceConfigSpec getResourcePoolSpec() {
    return this.resourcePoolSpec;
  }
  
  public void setResourcePoolSpec(ResourceConfigSpec paramResourceConfigSpec) {
    this.resourcePoolSpec = paramResourceConfigSpec;
  }
  
  public List<ImportSpec> getChild() {
    if (this.child == null)
      this.child = new ArrayList<>(); 
    return this.child;
  }
}
