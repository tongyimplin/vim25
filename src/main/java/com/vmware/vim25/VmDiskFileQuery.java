package com.vmware.vim25;

import com.vmware.vim25.FileQuery;
import com.vmware.vim25.VmDiskFileQuery;
import com.vmware.vim25.VmDiskFileQueryFilter;
import com.vmware.vim25.VmDiskFileQueryFlags;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmDiskFileQuery", propOrder = {"filter", "details"})
public class VmDiskFileQuery extends FileQuery {
  protected VmDiskFileQueryFilter filter;
  
  protected VmDiskFileQueryFlags details;
  
  public VmDiskFileQueryFilter getFilter() {
    return this.filter;
  }
  
  public void setFilter(VmDiskFileQueryFilter paramVmDiskFileQueryFilter) {
    this.filter = paramVmDiskFileQueryFilter;
  }
  
  public VmDiskFileQueryFlags getDetails() {
    return this.details;
  }
  
  public void setDetails(VmDiskFileQueryFlags paramVmDiskFileQueryFlags) {
    this.details = paramVmDiskFileQueryFlags;
  }
}
