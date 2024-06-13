package com.vmware.vim25;

import com.vmware.vim25.ArrayOfPodDiskLocator;
import com.vmware.vim25.PodDiskLocator;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPodDiskLocator", propOrder = {"podDiskLocator"})
public class ArrayOfPodDiskLocator {
  @XmlElement(name = "PodDiskLocator")
  protected List<PodDiskLocator> podDiskLocator;
  
  public List<PodDiskLocator> getPodDiskLocator() {
    if (this.podDiskLocator == null)
      this.podDiskLocator = new ArrayList<>(); 
    return this.podDiskLocator;
  }
}
