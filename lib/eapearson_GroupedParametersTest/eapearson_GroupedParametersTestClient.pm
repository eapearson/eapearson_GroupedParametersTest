package eapearson_GroupedParametersTest::eapearson_GroupedParametersTestClient;

use JSON::RPC::Client;
use POSIX;
use strict;
use Data::Dumper;
use URI;
use Bio::KBase::Exceptions;
my $get_time = sub { time, 0 };
eval {
    require Time::HiRes;
    $get_time = sub { Time::HiRes::gettimeofday() };
};

use Bio::KBase::AuthToken;

# Client version should match Impl version
# This is a Semantic Version number,
# http://semver.org
our $VERSION = "0.1.0";

=head1 NAME

eapearson_GroupedParametersTest::eapearson_GroupedParametersTestClient

=head1 DESCRIPTION


A KBase module: eapearson_GroupedParametersTest


=cut

sub new
{
    my($class, $url, @args) = @_;
    

    my $self = {
	client => eapearson_GroupedParametersTest::eapearson_GroupedParametersTestClient::RpcClient->new,
	url => $url,
	headers => [],
    };

    chomp($self->{hostname} = `hostname`);
    $self->{hostname} ||= 'unknown-host';

    #
    # Set up for propagating KBRPC_TAG and KBRPC_METADATA environment variables through
    # to invoked services. If these values are not set, we create a new tag
    # and a metadata field with basic information about the invoking script.
    #
    if ($ENV{KBRPC_TAG})
    {
	$self->{kbrpc_tag} = $ENV{KBRPC_TAG};
    }
    else
    {
	my ($t, $us) = &$get_time();
	$us = sprintf("%06d", $us);
	my $ts = strftime("%Y-%m-%dT%H:%M:%S.${us}Z", gmtime $t);
	$self->{kbrpc_tag} = "C:$0:$self->{hostname}:$$:$ts";
    }
    push(@{$self->{headers}}, 'Kbrpc-Tag', $self->{kbrpc_tag});

    if ($ENV{KBRPC_METADATA})
    {
	$self->{kbrpc_metadata} = $ENV{KBRPC_METADATA};
	push(@{$self->{headers}}, 'Kbrpc-Metadata', $self->{kbrpc_metadata});
    }

    if ($ENV{KBRPC_ERROR_DEST})
    {
	$self->{kbrpc_error_dest} = $ENV{KBRPC_ERROR_DEST};
	push(@{$self->{headers}}, 'Kbrpc-Errordest', $self->{kbrpc_error_dest});
    }

    #
    # This module requires authentication.
    #
    # We create an auth token, passing through the arguments that we were (hopefully) given.

    {
	my %arg_hash2 = @args;
	if (exists $arg_hash2{"token"}) {
	    $self->{token} = $arg_hash2{"token"};
	} elsif (exists $arg_hash2{"user_id"}) {
	    my $token = Bio::KBase::AuthToken->new(@args);
	    if (!$token->error_message) {
	        $self->{token} = $token->token;
	    }
	}
	
	if (exists $self->{token})
	{
	    $self->{client}->{token} = $self->{token};
	}
    }

    my $ua = $self->{client}->ua;	 
    my $timeout = $ENV{CDMI_TIMEOUT} || (30 * 60);	 
    $ua->timeout($timeout);
    bless $self, $class;
    #    $self->_validate_version();
    return $self;
}




=head2 validate_contact

  $result = $obj->validate_contact($contact)

=over 4

=item Parameter and return types

=begin html

<pre>
$contact is an eapearson_GroupedParametersTest.Contact
$result is an eapearson_GroupedParametersTest.TestResults
Contact is a reference to a hash where the following keys are defined:
	first_name has a value which is a string
	last_name has a value which is a string
	address has a value which is an eapearson_GroupedParametersTest.Address
	phones has a value which is a reference to a list where each element is an eapearson_GroupedParametersTest.Phone
	comment has a value which is a string
Address is a reference to a hash where the following keys are defined:
	street_address has a value which is a string
	city has a value which is a string
	state has a value which is a string
	postal_code has a value which is a string
	country has a value which is a string
Phone is a reference to a hash where the following keys are defined:
	phone_type has a value which is a string
	phone_number has a value which is a string
	phone_comments has a value which is a string
TestResults is a reference to a hash where the following keys are defined:
	status has a value which is a string
	detail has a value which is a string

</pre>

=end html

=begin text

$contact is an eapearson_GroupedParametersTest.Contact
$result is an eapearson_GroupedParametersTest.TestResults
Contact is a reference to a hash where the following keys are defined:
	first_name has a value which is a string
	last_name has a value which is a string
	address has a value which is an eapearson_GroupedParametersTest.Address
	phones has a value which is a reference to a list where each element is an eapearson_GroupedParametersTest.Phone
	comment has a value which is a string
Address is a reference to a hash where the following keys are defined:
	street_address has a value which is a string
	city has a value which is a string
	state has a value which is a string
	postal_code has a value which is a string
	country has a value which is a string
Phone is a reference to a hash where the following keys are defined:
	phone_type has a value which is a string
	phone_number has a value which is a string
	phone_comments has a value which is a string
TestResults is a reference to a hash where the following keys are defined:
	status has a value which is a string
	detail has a value which is a string


=end text

=item Description

Functions

=back

=cut

 sub validate_contact
{
    my($self, @args) = @_;

# Authentication: required

    if ((my $n = @args) != 1)
    {
	Bio::KBase::Exceptions::ArgumentValidationError->throw(error =>
							       "Invalid argument count for function validate_contact (received $n, expecting 1)");
    }
    {
	my($contact) = @args;

	my @_bad_arguments;
        (ref($contact) eq 'HASH') or push(@_bad_arguments, "Invalid type for argument 1 \"contact\" (value was \"$contact\")");
        if (@_bad_arguments) {
	    my $msg = "Invalid arguments passed to validate_contact:\n" . join("", map { "\t$_\n" } @_bad_arguments);
	    Bio::KBase::Exceptions::ArgumentValidationError->throw(error => $msg,
								   method_name => 'validate_contact');
	}
    }

    my $url = $self->{url};
    my $result = $self->{client}->call($url, $self->{headers}, {
	    method => "eapearson_GroupedParametersTest.validate_contact",
	    params => \@args,
    });
    if ($result) {
	if ($result->is_error) {
	    Bio::KBase::Exceptions::JSONRPC->throw(error => $result->error_message,
					       code => $result->content->{error}->{code},
					       method_name => 'validate_contact',
					       data => $result->content->{error}->{error} # JSON::RPC::ReturnObject only supports JSONRPC 1.1 or 1.O
					      );
	} else {
	    return wantarray ? @{$result->result} : $result->result->[0];
	}
    } else {
        Bio::KBase::Exceptions::HTTP->throw(error => "Error invoking method validate_contact",
					    status_line => $self->{client}->status_line,
					    method_name => 'validate_contact',
				       );
    }
}
 


=head2 validate_bug

  $result = $obj->validate_bug($bug)

=over 4

=item Parameter and return types

=begin html

<pre>
$bug is an eapearson_GroupedParametersTest.Bug
$result is an eapearson_GroupedParametersTest.TestResults
Bug is a reference to a hash where the following keys are defined:
	title has a value which is a string
	description has a value which is a string
	severity has a value which is an int
	effort has a value which is a string
	log_entries has a value which is a reference to a list where each element is an eapearson_GroupedParametersTest.LogEntry
LogEntry is a reference to a hash where the following keys are defined:
	time_started has a value which is a string
	time_spent has a value which is a float
	comments has a value which is a string
TestResults is a reference to a hash where the following keys are defined:
	status has a value which is a string
	detail has a value which is a string

</pre>

=end html

=begin text

$bug is an eapearson_GroupedParametersTest.Bug
$result is an eapearson_GroupedParametersTest.TestResults
Bug is a reference to a hash where the following keys are defined:
	title has a value which is a string
	description has a value which is a string
	severity has a value which is an int
	effort has a value which is a string
	log_entries has a value which is a reference to a list where each element is an eapearson_GroupedParametersTest.LogEntry
LogEntry is a reference to a hash where the following keys are defined:
	time_started has a value which is a string
	time_spent has a value which is a float
	comments has a value which is a string
TestResults is a reference to a hash where the following keys are defined:
	status has a value which is a string
	detail has a value which is a string


=end text

=item Description



=back

=cut

 sub validate_bug
{
    my($self, @args) = @_;

# Authentication: none

    if ((my $n = @args) != 1)
    {
	Bio::KBase::Exceptions::ArgumentValidationError->throw(error =>
							       "Invalid argument count for function validate_bug (received $n, expecting 1)");
    }
    {
	my($bug) = @args;

	my @_bad_arguments;
        (ref($bug) eq 'HASH') or push(@_bad_arguments, "Invalid type for argument 1 \"bug\" (value was \"$bug\")");
        if (@_bad_arguments) {
	    my $msg = "Invalid arguments passed to validate_bug:\n" . join("", map { "\t$_\n" } @_bad_arguments);
	    Bio::KBase::Exceptions::ArgumentValidationError->throw(error => $msg,
								   method_name => 'validate_bug');
	}
    }

    my $url = $self->{url};
    my $result = $self->{client}->call($url, $self->{headers}, {
	    method => "eapearson_GroupedParametersTest.validate_bug",
	    params => \@args,
    });
    if ($result) {
	if ($result->is_error) {
	    Bio::KBase::Exceptions::JSONRPC->throw(error => $result->error_message,
					       code => $result->content->{error}->{code},
					       method_name => 'validate_bug',
					       data => $result->content->{error}->{error} # JSON::RPC::ReturnObject only supports JSONRPC 1.1 or 1.O
					      );
	} else {
	    return wantarray ? @{$result->result} : $result->result->[0];
	}
    } else {
        Bio::KBase::Exceptions::HTTP->throw(error => "Error invoking method validate_bug",
					    status_line => $self->{client}->status_line,
					    method_name => 'validate_bug',
				       );
    }
}
 


=head2 validate_measurement

  $result = $obj->validate_measurement($Measurement)

=over 4

=item Parameter and return types

=begin html

<pre>
$Measurement is an eapearson_GroupedParametersTest.Measurement
$result is an eapearson_GroupedParametersTest.TestResults
Measurement is a reference to a hash where the following keys are defined:
	title has a value which is a string
	description has a value which is a string
	measure has a value which is an eapearson_GroupedParametersTest.Measure
	range has a value which is an eapearson_GroupedParametersTest.Range
Measure is a reference to a hash where the following keys are defined:
	measure_label has a value which is a string
	measure_description has a value which is a string
	measure_int has a value which is an int
	measure_float has a value which is a float
	measure_bool has a value which is an int
	measure_type has a value which is a string
Range is a reference to a hash where the following keys are defined:
	range_min has a value which is an int
	range_max has a value which is an int
TestResults is a reference to a hash where the following keys are defined:
	status has a value which is a string
	detail has a value which is a string

</pre>

=end html

=begin text

$Measurement is an eapearson_GroupedParametersTest.Measurement
$result is an eapearson_GroupedParametersTest.TestResults
Measurement is a reference to a hash where the following keys are defined:
	title has a value which is a string
	description has a value which is a string
	measure has a value which is an eapearson_GroupedParametersTest.Measure
	range has a value which is an eapearson_GroupedParametersTest.Range
Measure is a reference to a hash where the following keys are defined:
	measure_label has a value which is a string
	measure_description has a value which is a string
	measure_int has a value which is an int
	measure_float has a value which is a float
	measure_bool has a value which is an int
	measure_type has a value which is a string
Range is a reference to a hash where the following keys are defined:
	range_min has a value which is an int
	range_max has a value which is an int
TestResults is a reference to a hash where the following keys are defined:
	status has a value which is a string
	detail has a value which is a string


=end text

=item Description



=back

=cut

 sub validate_measurement
{
    my($self, @args) = @_;

# Authentication: required

    if ((my $n = @args) != 1)
    {
	Bio::KBase::Exceptions::ArgumentValidationError->throw(error =>
							       "Invalid argument count for function validate_measurement (received $n, expecting 1)");
    }
    {
	my($Measurement) = @args;

	my @_bad_arguments;
        (ref($Measurement) eq 'HASH') or push(@_bad_arguments, "Invalid type for argument 1 \"Measurement\" (value was \"$Measurement\")");
        if (@_bad_arguments) {
	    my $msg = "Invalid arguments passed to validate_measurement:\n" . join("", map { "\t$_\n" } @_bad_arguments);
	    Bio::KBase::Exceptions::ArgumentValidationError->throw(error => $msg,
								   method_name => 'validate_measurement');
	}
    }

    my $url = $self->{url};
    my $result = $self->{client}->call($url, $self->{headers}, {
	    method => "eapearson_GroupedParametersTest.validate_measurement",
	    params => \@args,
    });
    if ($result) {
	if ($result->is_error) {
	    Bio::KBase::Exceptions::JSONRPC->throw(error => $result->error_message,
					       code => $result->content->{error}->{code},
					       method_name => 'validate_measurement',
					       data => $result->content->{error}->{error} # JSON::RPC::ReturnObject only supports JSONRPC 1.1 or 1.O
					      );
	} else {
	    return wantarray ? @{$result->result} : $result->result->[0];
	}
    } else {
        Bio::KBase::Exceptions::HTTP->throw(error => "Error invoking method validate_measurement",
					    status_line => $self->{client}->status_line,
					    method_name => 'validate_measurement',
				       );
    }
}
 


=head2 validate_all_params

  $result = $obj->validate_all_params($AllParamTypes)

=over 4

=item Parameter and return types

=begin html

<pre>
$AllParamTypes is an eapearson_GroupedParametersTest.AllParamTypes
$result is an eapearson_GroupedParametersTest.TestResults
AllParamTypes is a reference to a hash where the following keys are defined:
	stringParam has a value which is a string
	textareaParam has a value which is a string
	dropdownParam has a value which is a string
	booleanParam has a value which is an int
	integerParam has a value which is an int
	floatParam has a value which is a float
	objectRefParam has a value which is a string
	autocompleteParam has a value which is a string
TestResults is a reference to a hash where the following keys are defined:
	status has a value which is a string
	detail has a value which is a string

</pre>

=end html

=begin text

$AllParamTypes is an eapearson_GroupedParametersTest.AllParamTypes
$result is an eapearson_GroupedParametersTest.TestResults
AllParamTypes is a reference to a hash where the following keys are defined:
	stringParam has a value which is a string
	textareaParam has a value which is a string
	dropdownParam has a value which is a string
	booleanParam has a value which is an int
	integerParam has a value which is an int
	floatParam has a value which is a float
	objectRefParam has a value which is a string
	autocompleteParam has a value which is a string
TestResults is a reference to a hash where the following keys are defined:
	status has a value which is a string
	detail has a value which is a string


=end text

=item Description



=back

=cut

 sub validate_all_params
{
    my($self, @args) = @_;

# Authentication: required

    if ((my $n = @args) != 1)
    {
	Bio::KBase::Exceptions::ArgumentValidationError->throw(error =>
							       "Invalid argument count for function validate_all_params (received $n, expecting 1)");
    }
    {
	my($AllParamTypes) = @args;

	my @_bad_arguments;
        (ref($AllParamTypes) eq 'HASH') or push(@_bad_arguments, "Invalid type for argument 1 \"AllParamTypes\" (value was \"$AllParamTypes\")");
        if (@_bad_arguments) {
	    my $msg = "Invalid arguments passed to validate_all_params:\n" . join("", map { "\t$_\n" } @_bad_arguments);
	    Bio::KBase::Exceptions::ArgumentValidationError->throw(error => $msg,
								   method_name => 'validate_all_params');
	}
    }

    my $url = $self->{url};
    my $result = $self->{client}->call($url, $self->{headers}, {
	    method => "eapearson_GroupedParametersTest.validate_all_params",
	    params => \@args,
    });
    if ($result) {
	if ($result->is_error) {
	    Bio::KBase::Exceptions::JSONRPC->throw(error => $result->error_message,
					       code => $result->content->{error}->{code},
					       method_name => 'validate_all_params',
					       data => $result->content->{error}->{error} # JSON::RPC::ReturnObject only supports JSONRPC 1.1 or 1.O
					      );
	} else {
	    return wantarray ? @{$result->result} : $result->result->[0];
	}
    } else {
        Bio::KBase::Exceptions::HTTP->throw(error => "Error invoking method validate_all_params",
					    status_line => $self->{client}->status_line,
					    method_name => 'validate_all_params',
				       );
    }
}
 


=head2 validate_all_seq_params

  $result = $obj->validate_all_seq_params($AllSequenceTypes)

=over 4

=item Parameter and return types

=begin html

<pre>
$AllSequenceTypes is an eapearson_GroupedParametersTest.AllSequenceTypes
$result is an eapearson_GroupedParametersTest.TestResults
AllSequenceTypes is a reference to a hash where the following keys are defined:
	stringParam has a value which is a reference to a list where each element is a string
	textareaParam has a value which is a reference to a list where each element is a string
	dropdownParam has a value which is a reference to a list where each element is a string
	booleanParam has a value which is a reference to a list where each element is an int
	integerParam has a value which is a reference to a list where each element is an int
	floatParam has a value which is a reference to a list where each element is a float
	objectRefParam has a value which is a reference to a list where each element is a string
	autocompleteParam has a value which is a reference to a list where each element is a string
TestResults is a reference to a hash where the following keys are defined:
	status has a value which is a string
	detail has a value which is a string

</pre>

=end html

=begin text

$AllSequenceTypes is an eapearson_GroupedParametersTest.AllSequenceTypes
$result is an eapearson_GroupedParametersTest.TestResults
AllSequenceTypes is a reference to a hash where the following keys are defined:
	stringParam has a value which is a reference to a list where each element is a string
	textareaParam has a value which is a reference to a list where each element is a string
	dropdownParam has a value which is a reference to a list where each element is a string
	booleanParam has a value which is a reference to a list where each element is an int
	integerParam has a value which is a reference to a list where each element is an int
	floatParam has a value which is a reference to a list where each element is a float
	objectRefParam has a value which is a reference to a list where each element is a string
	autocompleteParam has a value which is a reference to a list where each element is a string
TestResults is a reference to a hash where the following keys are defined:
	status has a value which is a string
	detail has a value which is a string


=end text

=item Description



=back

=cut

 sub validate_all_seq_params
{
    my($self, @args) = @_;

# Authentication: required

    if ((my $n = @args) != 1)
    {
	Bio::KBase::Exceptions::ArgumentValidationError->throw(error =>
							       "Invalid argument count for function validate_all_seq_params (received $n, expecting 1)");
    }
    {
	my($AllSequenceTypes) = @args;

	my @_bad_arguments;
        (ref($AllSequenceTypes) eq 'HASH') or push(@_bad_arguments, "Invalid type for argument 1 \"AllSequenceTypes\" (value was \"$AllSequenceTypes\")");
        if (@_bad_arguments) {
	    my $msg = "Invalid arguments passed to validate_all_seq_params:\n" . join("", map { "\t$_\n" } @_bad_arguments);
	    Bio::KBase::Exceptions::ArgumentValidationError->throw(error => $msg,
								   method_name => 'validate_all_seq_params');
	}
    }

    my $url = $self->{url};
    my $result = $self->{client}->call($url, $self->{headers}, {
	    method => "eapearson_GroupedParametersTest.validate_all_seq_params",
	    params => \@args,
    });
    if ($result) {
	if ($result->is_error) {
	    Bio::KBase::Exceptions::JSONRPC->throw(error => $result->error_message,
					       code => $result->content->{error}->{code},
					       method_name => 'validate_all_seq_params',
					       data => $result->content->{error}->{error} # JSON::RPC::ReturnObject only supports JSONRPC 1.1 or 1.O
					      );
	} else {
	    return wantarray ? @{$result->result} : $result->result->[0];
	}
    } else {
        Bio::KBase::Exceptions::HTTP->throw(error => "Error invoking method validate_all_seq_params",
					    status_line => $self->{client}->status_line,
					    method_name => 'validate_all_seq_params',
				       );
    }
}
 


=head2 validate_empty_param_group

  $result = $obj->validate_empty_param_group($input)

=over 4

=item Parameter and return types

=begin html

<pre>
$input is an eapearson_GroupedParametersTest.EmptyParamGroupInput
$result is an eapearson_GroupedParametersTest.TestResults
EmptyParamGroupInput is a reference to a hash where the following keys are defined:
	group1 has a value which is an eapearson_GroupedParametersTest.EmptyGroup
EmptyGroup is a reference to a hash where the following keys are defined
TestResults is a reference to a hash where the following keys are defined:
	status has a value which is a string
	detail has a value which is a string

</pre>

=end html

=begin text

$input is an eapearson_GroupedParametersTest.EmptyParamGroupInput
$result is an eapearson_GroupedParametersTest.TestResults
EmptyParamGroupInput is a reference to a hash where the following keys are defined:
	group1 has a value which is an eapearson_GroupedParametersTest.EmptyGroup
EmptyGroup is a reference to a hash where the following keys are defined
TestResults is a reference to a hash where the following keys are defined:
	status has a value which is a string
	detail has a value which is a string


=end text

=item Description



=back

=cut

 sub validate_empty_param_group
{
    my($self, @args) = @_;

# Authentication: required

    if ((my $n = @args) != 1)
    {
	Bio::KBase::Exceptions::ArgumentValidationError->throw(error =>
							       "Invalid argument count for function validate_empty_param_group (received $n, expecting 1)");
    }
    {
	my($input) = @args;

	my @_bad_arguments;
        (ref($input) eq 'HASH') or push(@_bad_arguments, "Invalid type for argument 1 \"input\" (value was \"$input\")");
        if (@_bad_arguments) {
	    my $msg = "Invalid arguments passed to validate_empty_param_group:\n" . join("", map { "\t$_\n" } @_bad_arguments);
	    Bio::KBase::Exceptions::ArgumentValidationError->throw(error => $msg,
								   method_name => 'validate_empty_param_group');
	}
    }

    my $url = $self->{url};
    my $result = $self->{client}->call($url, $self->{headers}, {
	    method => "eapearson_GroupedParametersTest.validate_empty_param_group",
	    params => \@args,
    });
    if ($result) {
	if ($result->is_error) {
	    Bio::KBase::Exceptions::JSONRPC->throw(error => $result->error_message,
					       code => $result->content->{error}->{code},
					       method_name => 'validate_empty_param_group',
					       data => $result->content->{error}->{error} # JSON::RPC::ReturnObject only supports JSONRPC 1.1 or 1.O
					      );
	} else {
	    return wantarray ? @{$result->result} : $result->result->[0];
	}
    } else {
        Bio::KBase::Exceptions::HTTP->throw(error => "Error invoking method validate_empty_param_group",
					    status_line => $self->{client}->status_line,
					    method_name => 'validate_empty_param_group',
				       );
    }
}
 


=head2 validate_seq_params

  $result = $obj->validate_seq_params($ValidateSeqParamsInput)

=over 4

=item Parameter and return types

=begin html

<pre>
$ValidateSeqParamsInput is an eapearson_GroupedParametersTest.ValidateSeqParamsInput
$result is an eapearson_GroupedParametersTest.TestResults
ValidateSeqParamsInput is a reference to a hash where the following keys are defined:
	stringParamRequired has a value which is a reference to a list where each element is a string
	stringParamOptional has a value which is a reference to a list where each element is a string
	groupOptional1 has a value which is a reference to a list where each element is an eapearson_GroupedParametersTest.GroupOptional1
	groupOptional2 has a value which is a reference to a list where each element is an eapearson_GroupedParametersTest.GroupOptional2
	groupRequired1 has a value which is a reference to a list where each element is an eapearson_GroupedParametersTest.GroupRequired1
	groupRequired2 has a value which is a reference to a list where each element is an eapearson_GroupedParametersTest.GroupRequired2
GroupOptional1 is a reference to a hash where the following keys are defined:
	stringParamOptional1GroupOptional1 has a value which is a string
	stringParamOptional2GroupOptional1 has a value which is a string
GroupOptional2 is a reference to a hash where the following keys are defined:
	stringParamRequiredGroupOptional2 has a value which is a string
	stringParamOptionalGroupOptional2 has a value which is a string
GroupRequired1 is a reference to a hash where the following keys are defined:
	stringParamOptional1GroupRequired1 has a value which is a string
	stringParamOptiona2GroupRequired1 has a value which is a string
GroupRequired2 is a reference to a hash where the following keys are defined:
	stringParamRequiredGroupRequired2 has a value which is a string
	stringParamOptionalGroupRequired2 has a value which is a string
TestResults is a reference to a hash where the following keys are defined:
	status has a value which is a string
	detail has a value which is a string

</pre>

=end html

=begin text

$ValidateSeqParamsInput is an eapearson_GroupedParametersTest.ValidateSeqParamsInput
$result is an eapearson_GroupedParametersTest.TestResults
ValidateSeqParamsInput is a reference to a hash where the following keys are defined:
	stringParamRequired has a value which is a reference to a list where each element is a string
	stringParamOptional has a value which is a reference to a list where each element is a string
	groupOptional1 has a value which is a reference to a list where each element is an eapearson_GroupedParametersTest.GroupOptional1
	groupOptional2 has a value which is a reference to a list where each element is an eapearson_GroupedParametersTest.GroupOptional2
	groupRequired1 has a value which is a reference to a list where each element is an eapearson_GroupedParametersTest.GroupRequired1
	groupRequired2 has a value which is a reference to a list where each element is an eapearson_GroupedParametersTest.GroupRequired2
GroupOptional1 is a reference to a hash where the following keys are defined:
	stringParamOptional1GroupOptional1 has a value which is a string
	stringParamOptional2GroupOptional1 has a value which is a string
GroupOptional2 is a reference to a hash where the following keys are defined:
	stringParamRequiredGroupOptional2 has a value which is a string
	stringParamOptionalGroupOptional2 has a value which is a string
GroupRequired1 is a reference to a hash where the following keys are defined:
	stringParamOptional1GroupRequired1 has a value which is a string
	stringParamOptiona2GroupRequired1 has a value which is a string
GroupRequired2 is a reference to a hash where the following keys are defined:
	stringParamRequiredGroupRequired2 has a value which is a string
	stringParamOptionalGroupRequired2 has a value which is a string
TestResults is a reference to a hash where the following keys are defined:
	status has a value which is a string
	detail has a value which is a string


=end text

=item Description



=back

=cut

 sub validate_seq_params
{
    my($self, @args) = @_;

# Authentication: required

    if ((my $n = @args) != 1)
    {
	Bio::KBase::Exceptions::ArgumentValidationError->throw(error =>
							       "Invalid argument count for function validate_seq_params (received $n, expecting 1)");
    }
    {
	my($ValidateSeqParamsInput) = @args;

	my @_bad_arguments;
        (ref($ValidateSeqParamsInput) eq 'HASH') or push(@_bad_arguments, "Invalid type for argument 1 \"ValidateSeqParamsInput\" (value was \"$ValidateSeqParamsInput\")");
        if (@_bad_arguments) {
	    my $msg = "Invalid arguments passed to validate_seq_params:\n" . join("", map { "\t$_\n" } @_bad_arguments);
	    Bio::KBase::Exceptions::ArgumentValidationError->throw(error => $msg,
								   method_name => 'validate_seq_params');
	}
    }

    my $url = $self->{url};
    my $result = $self->{client}->call($url, $self->{headers}, {
	    method => "eapearson_GroupedParametersTest.validate_seq_params",
	    params => \@args,
    });
    if ($result) {
	if ($result->is_error) {
	    Bio::KBase::Exceptions::JSONRPC->throw(error => $result->error_message,
					       code => $result->content->{error}->{code},
					       method_name => 'validate_seq_params',
					       data => $result->content->{error}->{error} # JSON::RPC::ReturnObject only supports JSONRPC 1.1 or 1.O
					      );
	} else {
	    return wantarray ? @{$result->result} : $result->result->[0];
	}
    } else {
        Bio::KBase::Exceptions::HTTP->throw(error => "Error invoking method validate_seq_params",
					    status_line => $self->{client}->status_line,
					    method_name => 'validate_seq_params',
				       );
    }
}
 


=head2 generate_error

  $result = $obj->generate_error($GenerateErrorParamsInput)

=over 4

=item Parameter and return types

=begin html

<pre>
$GenerateErrorParamsInput is an eapearson_GroupedParametersTest.GenerateErrorParamsInput
$result is an eapearson_GroupedParametersTest.TestResults
GenerateErrorParamsInput is a reference to a hash where the following keys are defined:
	errorType has a value which is a string
TestResults is a reference to a hash where the following keys are defined:
	status has a value which is a string
	detail has a value which is a string

</pre>

=end html

=begin text

$GenerateErrorParamsInput is an eapearson_GroupedParametersTest.GenerateErrorParamsInput
$result is an eapearson_GroupedParametersTest.TestResults
GenerateErrorParamsInput is a reference to a hash where the following keys are defined:
	errorType has a value which is a string
TestResults is a reference to a hash where the following keys are defined:
	status has a value which is a string
	detail has a value which is a string


=end text

=item Description



=back

=cut

 sub generate_error
{
    my($self, @args) = @_;

# Authentication: required

    if ((my $n = @args) != 1)
    {
	Bio::KBase::Exceptions::ArgumentValidationError->throw(error =>
							       "Invalid argument count for function generate_error (received $n, expecting 1)");
    }
    {
	my($GenerateErrorParamsInput) = @args;

	my @_bad_arguments;
        (ref($GenerateErrorParamsInput) eq 'HASH') or push(@_bad_arguments, "Invalid type for argument 1 \"GenerateErrorParamsInput\" (value was \"$GenerateErrorParamsInput\")");
        if (@_bad_arguments) {
	    my $msg = "Invalid arguments passed to generate_error:\n" . join("", map { "\t$_\n" } @_bad_arguments);
	    Bio::KBase::Exceptions::ArgumentValidationError->throw(error => $msg,
								   method_name => 'generate_error');
	}
    }

    my $url = $self->{url};
    my $result = $self->{client}->call($url, $self->{headers}, {
	    method => "eapearson_GroupedParametersTest.generate_error",
	    params => \@args,
    });
    if ($result) {
	if ($result->is_error) {
	    Bio::KBase::Exceptions::JSONRPC->throw(error => $result->error_message,
					       code => $result->content->{error}->{code},
					       method_name => 'generate_error',
					       data => $result->content->{error}->{error} # JSON::RPC::ReturnObject only supports JSONRPC 1.1 or 1.O
					      );
	} else {
	    return wantarray ? @{$result->result} : $result->result->[0];
	}
    } else {
        Bio::KBase::Exceptions::HTTP->throw(error => "Error invoking method generate_error",
					    status_line => $self->{client}->status_line,
					    method_name => 'generate_error',
				       );
    }
}
 
  
sub status
{
    my($self, @args) = @_;
    if ((my $n = @args) != 0) {
        Bio::KBase::Exceptions::ArgumentValidationError->throw(error =>
                                   "Invalid argument count for function status (received $n, expecting 0)");
    }
    my $url = $self->{url};
    my $result = $self->{client}->call($url, $self->{headers}, {
        method => "eapearson_GroupedParametersTest.status",
        params => \@args,
    });
    if ($result) {
        if ($result->is_error) {
            Bio::KBase::Exceptions::JSONRPC->throw(error => $result->error_message,
                           code => $result->content->{error}->{code},
                           method_name => 'status',
                           data => $result->content->{error}->{error} # JSON::RPC::ReturnObject only supports JSONRPC 1.1 or 1.O
                          );
        } else {
            return wantarray ? @{$result->result} : $result->result->[0];
        }
    } else {
        Bio::KBase::Exceptions::HTTP->throw(error => "Error invoking method status",
                        status_line => $self->{client}->status_line,
                        method_name => 'status',
                       );
    }
}
   

sub version {
    my ($self) = @_;
    my $result = $self->{client}->call($self->{url}, $self->{headers}, {
        method => "eapearson_GroupedParametersTest.version",
        params => [],
    });
    if ($result) {
        if ($result->is_error) {
            Bio::KBase::Exceptions::JSONRPC->throw(
                error => $result->error_message,
                code => $result->content->{code},
                method_name => 'generate_error',
            );
        } else {
            return wantarray ? @{$result->result} : $result->result->[0];
        }
    } else {
        Bio::KBase::Exceptions::HTTP->throw(
            error => "Error invoking method generate_error",
            status_line => $self->{client}->status_line,
            method_name => 'generate_error',
        );
    }
}

sub _validate_version {
    my ($self) = @_;
    my $svr_version = $self->version();
    my $client_version = $VERSION;
    my ($cMajor, $cMinor) = split(/\./, $client_version);
    my ($sMajor, $sMinor) = split(/\./, $svr_version);
    if ($sMajor != $cMajor) {
        Bio::KBase::Exceptions::ClientServerIncompatible->throw(
            error => "Major version numbers differ.",
            server_version => $svr_version,
            client_version => $client_version
        );
    }
    if ($sMinor < $cMinor) {
        Bio::KBase::Exceptions::ClientServerIncompatible->throw(
            error => "Client minor version greater than Server minor version.",
            server_version => $svr_version,
            client_version => $client_version
        );
    }
    if ($sMinor > $cMinor) {
        warn "New client version available for eapearson_GroupedParametersTest::eapearson_GroupedParametersTestClient\n";
    }
    if ($sMajor == 0) {
        warn "eapearson_GroupedParametersTest::eapearson_GroupedParametersTestClient version is $svr_version. API subject to change.\n";
    }
}

=head1 TYPES



=head2 Address

=over 4



=item Description

A pure string test of lists of structures (groups)


=item Definition

=begin html

<pre>
a reference to a hash where the following keys are defined:
street_address has a value which is a string
city has a value which is a string
state has a value which is a string
postal_code has a value which is a string
country has a value which is a string

</pre>

=end html

=begin text

a reference to a hash where the following keys are defined:
street_address has a value which is a string
city has a value which is a string
state has a value which is a string
postal_code has a value which is a string
country has a value which is a string


=end text

=back



=head2 Phone

=over 4



=item Definition

=begin html

<pre>
a reference to a hash where the following keys are defined:
phone_type has a value which is a string
phone_number has a value which is a string
phone_comments has a value which is a string

</pre>

=end html

=begin text

a reference to a hash where the following keys are defined:
phone_type has a value which is a string
phone_number has a value which is a string
phone_comments has a value which is a string


=end text

=back



=head2 Contact

=over 4



=item Definition

=begin html

<pre>
a reference to a hash where the following keys are defined:
first_name has a value which is a string
last_name has a value which is a string
address has a value which is an eapearson_GroupedParametersTest.Address
phones has a value which is a reference to a list where each element is an eapearson_GroupedParametersTest.Phone
comment has a value which is a string

</pre>

=end html

=begin text

a reference to a hash where the following keys are defined:
first_name has a value which is a string
last_name has a value which is a string
address has a value which is an eapearson_GroupedParametersTest.Address
phones has a value which is a reference to a list where each element is an eapearson_GroupedParametersTest.Phone
comment has a value which is a string


=end text

=back



=head2 LogEntry

=over 4



=item Description

Throw in floats and ints


=item Definition

=begin html

<pre>
a reference to a hash where the following keys are defined:
time_started has a value which is a string
time_spent has a value which is a float
comments has a value which is a string

</pre>

=end html

=begin text

a reference to a hash where the following keys are defined:
time_started has a value which is a string
time_spent has a value which is a float
comments has a value which is a string


=end text

=back



=head2 Bug

=over 4



=item Definition

=begin html

<pre>
a reference to a hash where the following keys are defined:
title has a value which is a string
description has a value which is a string
severity has a value which is an int
effort has a value which is a string
log_entries has a value which is a reference to a list where each element is an eapearson_GroupedParametersTest.LogEntry

</pre>

=end html

=begin text

a reference to a hash where the following keys are defined:
title has a value which is a string
description has a value which is a string
severity has a value which is an int
effort has a value which is a string
log_entries has a value which is a reference to a list where each element is an eapearson_GroupedParametersTest.LogEntry


=end text

=back



=head2 Fluid

=over 4



=item Description

Now some flat groups


=item Definition

=begin html

<pre>
a reference to a hash where the following keys are defined:
max_volume has a value which is a float
current_volume has a value which is a float

</pre>

=end html

=begin text

a reference to a hash where the following keys are defined:
max_volume has a value which is a float
current_volume has a value which is a float


=end text

=back



=head2 InspectionItem

=over 4



=item Definition

=begin html

<pre>
a reference to a hash where the following keys are defined:
checked has a value which is an int
condition has a value which is a string
repair_cost has a value which is a float

</pre>

=end html

=begin text

a reference to a hash where the following keys are defined:
checked has a value which is an int
condition has a value which is a string
repair_cost has a value which is a float


=end text

=back



=head2 Date

=over 4



=item Definition

=begin html

<pre>
a reference to a hash where the following keys are defined:
year has a value which is an int
month has a value which is an int
day has a value which is an int

</pre>

=end html

=begin text

a reference to a hash where the following keys are defined:
year has a value which is an int
month has a value which is an int
day has a value which is an int


=end text

=back



=head2 CarChecklist

=over 4



=item Definition

=begin html

<pre>
a reference to a hash where the following keys are defined:
date has a value which is an eapearson_GroupedParametersTest.Date
left_door has a value which is an eapearson_GroupedParametersTest.InspectionItem
right_door has a value which is an eapearson_GroupedParametersTest.InspectionItem
interior has a value which is an eapearson_GroupedParametersTest.InspectionItem
gas has a value which is an eapearson_GroupedParametersTest.Fluid
wiper_fluid has a value which is an eapearson_GroupedParametersTest.Fluid
coolant has a value which is an eapearson_GroupedParametersTest.Fluid

</pre>

=end html

=begin text

a reference to a hash where the following keys are defined:
date has a value which is an eapearson_GroupedParametersTest.Date
left_door has a value which is an eapearson_GroupedParametersTest.InspectionItem
right_door has a value which is an eapearson_GroupedParametersTest.InspectionItem
interior has a value which is an eapearson_GroupedParametersTest.InspectionItem
gas has a value which is an eapearson_GroupedParametersTest.Fluid
wiper_fluid has a value which is an eapearson_GroupedParametersTest.Fluid
coolant has a value which is an eapearson_GroupedParametersTest.Fluid


=end text

=back



=head2 TestResults

=over 4



=item Definition

=begin html

<pre>
a reference to a hash where the following keys are defined:
status has a value which is a string
detail has a value which is a string

</pre>

=end html

=begin text

a reference to a hash where the following keys are defined:
status has a value which is a string
detail has a value which is a string


=end text

=back



=head2 Measure

=over 4



=item Description

Measurement 
We use this to test all parameter types.


=item Definition

=begin html

<pre>
a reference to a hash where the following keys are defined:
measure_label has a value which is a string
measure_description has a value which is a string
measure_int has a value which is an int
measure_float has a value which is a float
measure_bool has a value which is an int
measure_type has a value which is a string

</pre>

=end html

=begin text

a reference to a hash where the following keys are defined:
measure_label has a value which is a string
measure_description has a value which is a string
measure_int has a value which is an int
measure_float has a value which is a float
measure_bool has a value which is an int
measure_type has a value which is a string


=end text

=back



=head2 Range

=over 4



=item Definition

=begin html

<pre>
a reference to a hash where the following keys are defined:
range_min has a value which is an int
range_max has a value which is an int

</pre>

=end html

=begin text

a reference to a hash where the following keys are defined:
range_min has a value which is an int
range_max has a value which is an int


=end text

=back



=head2 Measurement

=over 4



=item Definition

=begin html

<pre>
a reference to a hash where the following keys are defined:
title has a value which is a string
description has a value which is a string
measure has a value which is an eapearson_GroupedParametersTest.Measure
range has a value which is an eapearson_GroupedParametersTest.Range

</pre>

=end html

=begin text

a reference to a hash where the following keys are defined:
title has a value which is a string
description has a value which is a string
measure has a value which is an eapearson_GroupedParametersTest.Measure
range has a value which is an eapearson_GroupedParametersTest.Range


=end text

=back



=head2 AllParamTypes

=over 4



=item Definition

=begin html

<pre>
a reference to a hash where the following keys are defined:
stringParam has a value which is a string
textareaParam has a value which is a string
dropdownParam has a value which is a string
booleanParam has a value which is an int
integerParam has a value which is an int
floatParam has a value which is a float
objectRefParam has a value which is a string
autocompleteParam has a value which is a string

</pre>

=end html

=begin text

a reference to a hash where the following keys are defined:
stringParam has a value which is a string
textareaParam has a value which is a string
dropdownParam has a value which is a string
booleanParam has a value which is an int
integerParam has a value which is an int
floatParam has a value which is a float
objectRefParam has a value which is a string
autocompleteParam has a value which is a string


=end text

=back



=head2 AllSequenceTypes

=over 4



=item Definition

=begin html

<pre>
a reference to a hash where the following keys are defined:
stringParam has a value which is a reference to a list where each element is a string
textareaParam has a value which is a reference to a list where each element is a string
dropdownParam has a value which is a reference to a list where each element is a string
booleanParam has a value which is a reference to a list where each element is an int
integerParam has a value which is a reference to a list where each element is an int
floatParam has a value which is a reference to a list where each element is a float
objectRefParam has a value which is a reference to a list where each element is a string
autocompleteParam has a value which is a reference to a list where each element is a string

</pre>

=end html

=begin text

a reference to a hash where the following keys are defined:
stringParam has a value which is a reference to a list where each element is a string
textareaParam has a value which is a reference to a list where each element is a string
dropdownParam has a value which is a reference to a list where each element is a string
booleanParam has a value which is a reference to a list where each element is an int
integerParam has a value which is a reference to a list where each element is an int
floatParam has a value which is a reference to a list where each element is a float
objectRefParam has a value which is a reference to a list where each element is a string
autocompleteParam has a value which is a reference to a list where each element is a string


=end text

=back



=head2 EmptyGroup

=over 4



=item Description

EMPTY GROUP


=item Definition

=begin html

<pre>
a reference to a hash where the following keys are defined
</pre>

=end html

=begin text

a reference to a hash where the following keys are defined

=end text

=back



=head2 EmptyParamGroupInput

=over 4



=item Definition

=begin html

<pre>
a reference to a hash where the following keys are defined:
group1 has a value which is an eapearson_GroupedParametersTest.EmptyGroup

</pre>

=end html

=begin text

a reference to a hash where the following keys are defined:
group1 has a value which is an eapearson_GroupedParametersTest.EmptyGroup


=end text

=back



=head2 GroupOptional1

=over 4



=item Description

All Configurations of Sequences


=item Definition

=begin html

<pre>
a reference to a hash where the following keys are defined:
stringParamOptional1GroupOptional1 has a value which is a string
stringParamOptional2GroupOptional1 has a value which is a string

</pre>

=end html

=begin text

a reference to a hash where the following keys are defined:
stringParamOptional1GroupOptional1 has a value which is a string
stringParamOptional2GroupOptional1 has a value which is a string


=end text

=back



=head2 GroupOptional2

=over 4



=item Definition

=begin html

<pre>
a reference to a hash where the following keys are defined:
stringParamRequiredGroupOptional2 has a value which is a string
stringParamOptionalGroupOptional2 has a value which is a string

</pre>

=end html

=begin text

a reference to a hash where the following keys are defined:
stringParamRequiredGroupOptional2 has a value which is a string
stringParamOptionalGroupOptional2 has a value which is a string


=end text

=back



=head2 GroupRequired1

=over 4



=item Definition

=begin html

<pre>
a reference to a hash where the following keys are defined:
stringParamOptional1GroupRequired1 has a value which is a string
stringParamOptiona2GroupRequired1 has a value which is a string

</pre>

=end html

=begin text

a reference to a hash where the following keys are defined:
stringParamOptional1GroupRequired1 has a value which is a string
stringParamOptiona2GroupRequired1 has a value which is a string


=end text

=back



=head2 GroupRequired2

=over 4



=item Definition

=begin html

<pre>
a reference to a hash where the following keys are defined:
stringParamRequiredGroupRequired2 has a value which is a string
stringParamOptionalGroupRequired2 has a value which is a string

</pre>

=end html

=begin text

a reference to a hash where the following keys are defined:
stringParamRequiredGroupRequired2 has a value which is a string
stringParamOptionalGroupRequired2 has a value which is a string


=end text

=back



=head2 ValidateSeqParamsInput

=over 4



=item Definition

=begin html

<pre>
a reference to a hash where the following keys are defined:
stringParamRequired has a value which is a reference to a list where each element is a string
stringParamOptional has a value which is a reference to a list where each element is a string
groupOptional1 has a value which is a reference to a list where each element is an eapearson_GroupedParametersTest.GroupOptional1
groupOptional2 has a value which is a reference to a list where each element is an eapearson_GroupedParametersTest.GroupOptional2
groupRequired1 has a value which is a reference to a list where each element is an eapearson_GroupedParametersTest.GroupRequired1
groupRequired2 has a value which is a reference to a list where each element is an eapearson_GroupedParametersTest.GroupRequired2

</pre>

=end html

=begin text

a reference to a hash where the following keys are defined:
stringParamRequired has a value which is a reference to a list where each element is a string
stringParamOptional has a value which is a reference to a list where each element is a string
groupOptional1 has a value which is a reference to a list where each element is an eapearson_GroupedParametersTest.GroupOptional1
groupOptional2 has a value which is a reference to a list where each element is an eapearson_GroupedParametersTest.GroupOptional2
groupRequired1 has a value which is a reference to a list where each element is an eapearson_GroupedParametersTest.GroupRequired1
groupRequired2 has a value which is a reference to a list where each element is an eapearson_GroupedParametersTest.GroupRequired2


=end text

=back



=head2 GenerateErrorParamsInput

=over 4



=item Definition

=begin html

<pre>
a reference to a hash where the following keys are defined:
errorType has a value which is a string

</pre>

=end html

=begin text

a reference to a hash where the following keys are defined:
errorType has a value which is a string


=end text

=back



=cut

package eapearson_GroupedParametersTest::eapearson_GroupedParametersTestClient::RpcClient;
use base 'JSON::RPC::Client';
use POSIX;
use strict;

#
# Override JSON::RPC::Client::call because it doesn't handle error returns properly.
#

sub call {
    my ($self, $uri, $headers, $obj) = @_;
    my $result;


    {
	if ($uri =~ /\?/) {
	    $result = $self->_get($uri);
	}
	else {
	    Carp::croak "not hashref." unless (ref $obj eq 'HASH');
	    $result = $self->_post($uri, $headers, $obj);
	}

    }

    my $service = $obj->{method} =~ /^system\./ if ( $obj );

    $self->status_line($result->status_line);

    if ($result->is_success) {

        return unless($result->content); # notification?

        if ($service) {
            return JSON::RPC::ServiceObject->new($result, $self->json);
        }

        return JSON::RPC::ReturnObject->new($result, $self->json);
    }
    elsif ($result->content_type eq 'application/json')
    {
        return JSON::RPC::ReturnObject->new($result, $self->json);
    }
    else {
        return;
    }
}


sub _post {
    my ($self, $uri, $headers, $obj) = @_;
    my $json = $self->json;

    $obj->{version} ||= $self->{version} || '1.1';

    if ($obj->{version} eq '1.0') {
        delete $obj->{version};
        if (exists $obj->{id}) {
            $self->id($obj->{id}) if ($obj->{id}); # if undef, it is notification.
        }
        else {
            $obj->{id} = $self->id || ($self->id('JSON::RPC::Client'));
        }
    }
    else {
        # $obj->{id} = $self->id if (defined $self->id);
	# Assign a random number to the id if one hasn't been set
	$obj->{id} = (defined $self->id) ? $self->id : substr(rand(),2);
    }

    my $content = $json->encode($obj);

    $self->ua->post(
        $uri,
        Content_Type   => $self->{content_type},
        Content        => $content,
        Accept         => 'application/json',
	@$headers,
	($self->{token} ? (Authorization => $self->{token}) : ()),
    );
}



1;
