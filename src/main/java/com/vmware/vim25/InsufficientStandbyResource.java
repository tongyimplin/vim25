package com.vmware.vim25;

import com.vmware.vim25.InsufficientResourcesFault;
import com.vmware.vim25.InsufficientStandbyCpuResource;
import com.vmware.vim25.InsufficientStandbyMemoryResource;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsufficientStandbyResource")
@XmlSeeAlso({InsufficientStandbyCpuResource.class, InsufficientStandbyMemoryResource.class})
public class InsufficientStandbyResource extends InsufficientResourcesFault {}
