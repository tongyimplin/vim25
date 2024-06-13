package com.vmware.vim25;

import com.vmware.vim25.FileQuery;
import com.vmware.vim25.TemplateConfigFileQuery;
import com.vmware.vim25.VmConfigFileQuery;
import com.vmware.vim25.VmConfigFileQueryFilter;
import com.vmware.vim25.VmConfigFileQueryFlags;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmConfigFileQuery", propOrder = {"filter", "details"})
@XmlSeeAlso({TemplateConfigFileQuery.class})
public class VmConfigFileQuery extends FileQuery {
  protected VmConfigFileQueryFilter filter;
  
  protected VmConfigFileQueryFlags details;
  
  public VmConfigFileQueryFilter getFilter() {
    return this.filter;
  }
  
  public void setFilter(VmConfigFileQueryFilter paramVmConfigFileQueryFilter) {
    this.filter = paramVmConfigFileQueryFilter;
  }
  
  public VmConfigFileQueryFlags getDetails() {
    return this.details;
  }
  
  public void setDetails(VmConfigFileQueryFlags paramVmConfigFileQueryFlags) {
    this.details = paramVmConfigFileQueryFlags;
  }
}
