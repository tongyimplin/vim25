package com.vmware.vim25;

import com.vmware.vim25.KmipClusterInfo;
import com.vmware.vim25.ListKmsClustersResponse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "ListKmsClustersResponse")
public class ListKmsClustersResponse {
  protected List<KmipClusterInfo> returnval;
  
  public List<KmipClusterInfo> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
