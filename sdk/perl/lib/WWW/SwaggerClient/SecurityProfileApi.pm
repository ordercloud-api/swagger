=begin comment

OrderCloud

A full ecommerce backend as a service.

OpenAPI spec version: 0.1
Contact: ordercloud@four51.com
Generated by: https://github.com/swagger-api/swagger-codegen.git

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

=end comment

=cut

#
# NOTE: This class is auto generated by the swagger code generator program. 
# Do not edit the class manually.
# Ref: https://github.com/swagger-api/swagger-codegen
#
package WWW::SwaggerClient::SecurityProfileApi;

require 5.6.0;
use strict;
use warnings;
use utf8; 
use Exporter;
use Carp qw( croak );
use Log::Any qw($log);

use WWW::SwaggerClient::ApiClient;
use WWW::SwaggerClient::Configuration;

use base "Class::Data::Inheritable";

__PACKAGE__->mk_classdata('method_documentation' => {});

sub new {
    my $class   = shift;
    my (%self) = (
        'api_client' => WWW::SwaggerClient::ApiClient->instance,
        @_
    );

    #my $self = {
    #    #api_client => $options->{api_client}
    #    api_client => $default_api_client
    #}; 

    bless \%self, $class;

}


#
# get
#
# 
# 
# @param string $security_profile_id ID of the security profile. (required)
{
    my $params = {
    'security_profile_id' => {
        data_type => 'string',
        description => 'ID of the security profile.',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'get' } = { 
    	summary => '',
        params => $params,
        returns => 'object',
        };
}
# @return object
#
sub get {
    my ($self, %args) = @_;

    # verify the required parameter 'security_profile_id' is set
    unless (exists $args{'security_profile_id'}) {
      croak("Missing the required parameter 'security_profile_id' when calling get");
    }

    # parse inputs
    my $_resource_path = '/SecurityProfiles/{securityProfileID}';
    $_resource_path =~ s/{format}/json/; # default format to json

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept();
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type();

    # path params
    if ( exists $args{'security_profile_id'}) {
        my $_base_variable = "{" . "securityProfileID" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'security_profile_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw(auth )];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('object', $response);
    return $_response_object;
}

#
# list
#
# 
# 
# @param string $search Word or phrase to search for. (optional)
# @param string $search_on Comma-delimited list of fields to search on. (optional)
# @param string $sort_by Comma-delimited list of fields to sort by. (optional)
# @param int $page Page of results to return. Default: 1 (optional)
# @param int $page_size Number of results to return per page. Default: 20, max: 100. (optional)
{
    my $params = {
    'search' => {
        data_type => 'string',
        description => 'Word or phrase to search for.',
        required => '0',
    },
    'search_on' => {
        data_type => 'string',
        description => 'Comma-delimited list of fields to search on.',
        required => '0',
    },
    'sort_by' => {
        data_type => 'string',
        description => 'Comma-delimited list of fields to sort by.',
        required => '0',
    },
    'page' => {
        data_type => 'int',
        description => 'Page of results to return. Default: 1',
        required => '0',
    },
    'page_size' => {
        data_type => 'int',
        description => 'Number of results to return per page. Default: 20, max: 100.',
        required => '0',
    },
    };
    __PACKAGE__->method_documentation->{ 'list' } = { 
    	summary => '',
        params => $params,
        returns => 'object',
        };
}
# @return object
#
sub list {
    my ($self, %args) = @_;

    # parse inputs
    my $_resource_path = '/SecurityProfiles';
    $_resource_path =~ s/{format}/json/; # default format to json

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept();
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type();

    # query params
    if ( exists $args{'search'}) {
        $query_params->{'search'} = $self->{api_client}->to_query_value($args{'search'});
    }

    # query params
    if ( exists $args{'search_on'}) {
        $query_params->{'searchOn'} = $self->{api_client}->to_query_value($args{'search_on'});
    }

    # query params
    if ( exists $args{'sort_by'}) {
        $query_params->{'sortBy'} = $self->{api_client}->to_query_value($args{'sort_by'});
    }

    # query params
    if ( exists $args{'page'}) {
        $query_params->{'page'} = $self->{api_client}->to_query_value($args{'page'});
    }

    # query params
    if ( exists $args{'page_size'}) {
        $query_params->{'pageSize'} = $self->{api_client}->to_query_value($args{'page_size'});
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw(auth )];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('object', $response);
    return $_response_object;
}

1;