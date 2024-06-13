package com.vmware.vim25;

import com.vmware.vim25.DestinationVsanDisabled;
import com.vmware.vim25.VsanClusterUuidMismatch;
import com.vmware.vim25.VsanFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CannotMoveVsanEnabledHost")
@XmlSeeAlso({DestinationVsanDisabled.class, VsanClusterUuidMismatch.class})
public class CannotMoveVsanEnabledHost extends VsanFault {}
