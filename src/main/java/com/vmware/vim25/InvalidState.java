package com.vmware.vim25;

import com.vmware.vim25.CannotPowerOffVmInCluster;
import com.vmware.vim25.EncryptionKeyRequired;
import com.vmware.vim25.InvalidDatastoreState;
import com.vmware.vim25.InvalidHostState;
import com.vmware.vim25.InvalidPowerState;
import com.vmware.vim25.InvalidVmState;
import com.vmware.vim25.MksConnectionLimitReached;
import com.vmware.vim25.NoActiveHostInCluster;
import com.vmware.vim25.OvfConsumerPowerOnFault;
import com.vmware.vim25.QuestionPending;
import com.vmware.vim25.VimFault;
import com.vmware.vim25.VmPowerOnDisabled;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvalidState")
@XmlSeeAlso({EncryptionKeyRequired.class, OvfConsumerPowerOnFault.class, NoActiveHostInCluster.class, QuestionPending.class, MksConnectionLimitReached.class, InvalidPowerState.class, VmPowerOnDisabled.class, CannotPowerOffVmInCluster.class, InvalidHostState.class, InvalidVmState.class, InvalidDatastoreState.class})
public class InvalidState extends VimFault {}
